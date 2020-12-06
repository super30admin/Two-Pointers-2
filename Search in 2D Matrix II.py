# Time: O(m+n)
# Space: O(1)
class Solution:
    def searchMatrix(self, matrix, target):
        if matrix:
            rows, cols = len(matrix) - 1, len(matrix[0]) - 1
            i, j = 0, cols
            while i <= rows and j >= 0:
                element = matrix[i][j]

                if target < element:
                    j -= 1
                elif target > element:
                    i += 1
                else:
                    return True
        return False
