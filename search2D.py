"""
We begin from top-right (or bottom-left) corner of the matrix.
If matrix[i][j] == target, return True.
If matrix[i][j] > target, move left; else move down.
"""
"""
Time Complexity: O(m + n) - move across a row and down a column
Space Complexity: O(1) — constant space
"""

class search2D:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        if not matrix or not matrix[0]:
            return False

        rows, cols = len(matrix), len(matrix[0])
        r, c = 0, cols - 1

        while r < rows and c >= 0:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                c -= 1
            else:
                r += 1

        return False

if __name__=="__main__":
    obj = search2D()
    matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
    target = 5
    print(obj.searchMatrix(matrix,target))

        