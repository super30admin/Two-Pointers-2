# Time Complexity -  O(m + n) 
# Space Complexity -  O(1)

class Solution:
    def searchMatrix(self, matrix, target):
        if not matrix or not matrix[0]:
            return False
        col, row = len(matrix[0]) - 1, 0
        while col >= 0 and row <= len(matrix) - 1:
            if target == matrix[row][col]:
                return True
            elif target < matrix[row][col]:
                col -= 1
            else:
                row += 1
        return False
