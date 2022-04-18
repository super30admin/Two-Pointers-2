'''https://leetcode.com/problems/search-a-2d-matrix-ii/'''


# Time Complexity : O(N+M)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def searchMatrix(self, matrix: 'list[list[int]]', target: int) -> bool:
        i, j = len(matrix)-1, 0
        
        # one pointer in bottom left corner
        # operation is up if num > target
        # right if num < target
        while i >= 0 and j < len(matrix[0]):
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                i -= 1
            else:
                j += 1
        
        return False