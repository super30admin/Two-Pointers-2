# https://leetcode.com/problems/search-a-2d-matrix-ii/
# Time O(m+n) Max numbers are searched from one corner to the other diagnonally opposite corner.
# Space O(1) : No extra space used

class Solution:
    def searchMatrix(self, matrix, target):
        if not matrix: return False
        m,n = len(matrix), len(matrix[0])
        i,j = 0, n-1
        # Start at the top right corner
        while(i < m and j >=0):
            if matrix[i][j] == target:
                return True
            
            if matrix[i][j] < target:
                i += 1
            else:
                j -= 1
        return False

matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target = 5
s = Solution()
output = s.searchMatrix(matrix, target)
output1 = s.searchMatrix(matrix, 20)
print(output, output1)
        