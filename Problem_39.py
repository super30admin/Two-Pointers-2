# TC: O(m + n)
# SC: O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        row, col = 0, 0
        while row < m:
            if col < n and target == matrix[row][col]:
                return True
            elif target >= matrix[row][0] and target <= matrix[row][n-1] and col < n:
                col += 1
            else:
                row += 1
                col = 0

        return False