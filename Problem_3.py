# https://leetcode.com/problems/search-a-2d-matrix-ii/description/


class Solution:
    def searchMatrix(self, matrix, target):
        rows, cols = len(matrix), len(matrix[0])
        i, j = 0, cols - 1
        while j >= 0 and i < rows:
            curr = matrix[i][j]
            if curr == target:
                return True
            if target < curr:
                j -= 1
            else:
                i += 1
        return False
    
matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target = 5

sl = Solution().searchMatrix(matrix,target)
print(sl)