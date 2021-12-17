class Solution:
    def searchMatrix(self, matrix, target: int) -> bool:
        # Time Complexity = O(m+n)
        # Space Complexity = O(1)

        if matrix is None or len(matrix) == 0:
            return False

        m, n = len(matrix), len(matrix[0])

        # Start from the last element of the first row
        # We can also start from the last element of the first column
        i, j = 0, n - 1
        # i represents the row and j the columns
        while (i < m and j >= 0):
            if matrix[i][j] == target:
                return True
            elif target > matrix[i][j]:
                i += 1
            else:
                j -= 1

        return False