# TC: O(n)
# SC: O(1)
class Solution:
    def searchMatrix(self, matrix, target):
        r, c = len(matrix), len(matrix[0])
        i, j = 0, c-1
        while i < r and j >=0:            
            if target == matrix[i][j]:
                return True
            elif target > matrix[i][j]:
                i += 1
            else:
                j -= 1
        return False