class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or not len(matrix):
            return False
        rows, cols = len(matrix), len(matrix[0])
        r, c = 0, cols - 1

        while (r < rows and c >= 0):
            if target == matrix[r][c]:
                return True
            if target < matrix[r][c]:
                c -= 1
            else:
                r += 1
        return False
        # T: O(m + n), S: O(1)