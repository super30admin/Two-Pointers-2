#LC 240
# Time Complexity : 0(m+n)
# Space Complexity : O(1)
class Solution:
    def searchMatrix(self, matrix, target):
        m = len(matrix)
        if m < 1:
            return False
        n = len(matrix[0])
        if n < 1:
            return False
        row, col = 0, n - 1
        while row < m and col >= 0:
            curr = matrix[row][col]
            if target > curr:
                row += 1
            elif target < curr:
                col -= 1
            else:
                return True
        return False