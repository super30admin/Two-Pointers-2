# 240. Search a 2D Matrix II
# https://leetcode.com/problems/search-a-2d-matrix-ii/

# Time complexiety: O(n+m)
# Space complexiety: O(1)

class Solution:
    def searchMatrix(self, matrix, target) -> bool:
        row = len(matrix) - 1
        col = 0

        while row >= 0 and col < len(matrix[0]):
            if matrix[row][col] > target:
                row -= 1
            elif matrix[row][col] < target:
                col  += 1
            else:
                return True
        return False

obj = Solution()
print(obj.searchMatrix([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]],500))