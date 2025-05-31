# Time Complexity: O(m+n)
# Spcae Complexity: O(1)
class Solution:
    def searchMatrix(self, matrix, target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        r = 0
        c = n-1
        while(r<m and c>=0):
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] < target:
                r += 1
            else:
                c -= 1
        return False