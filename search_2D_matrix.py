# Time Complexity : Add - O(m*n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
'''
1. I start from bottom left corner, if target is equal to the bottom left element, return True
2. If it is less than the elment, I decrement row
3. If it is greater than the element, I increment col
'''

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix == [] or matrix[0] == []:
            return False
        
        rows = len(matrix)
        cols = len(matrix[0])
        
        x, y = rows-1, 0
        
        while x >=0 and y < cols:
            if x >=0 and y < cols and target == matrix[x][y]:
                return True

            elif x >=0 and y < cols and target < matrix[x][y]:
                x -= 1
                
            elif x >=0 and y < cols and target > matrix[x][y]:
                y += 1
            
        return False
            