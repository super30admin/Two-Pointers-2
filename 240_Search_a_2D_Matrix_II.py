# Time Complexity : O(n+m) [m = number of rows, n = numner of colums]
# 
# Space Complexity : O(1)
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No
#
# Problem Approach
# 1. Start from top rightmost cell.
# 2. Keep moving left until the value is greater than or equal to target, otherwise move down 
class Solution:
    
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix or not matrix[0]:
            return False
        m, n = len(matrix), len(matrix[0])
        x, y = 0, n-1
        
        while x <=m-1 or y>=0:
            if matrix[x][y] == target:
                return True
            elif y>0 and matrix[x][y-1] >= target:
                y-=1
                if y < 0:break
            else:
                x+=1
                if x == m:break
        return False