# Time Complexity : o(m*n)
# Space Complexity : o(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
# Use two pointers. Start by assigning the two pointers in the left bottom corner of the grid.
# If the target element is less than the element at the currect location move upwards 
#Similarly If the target element is greater than the element at the currect location move right.
#This way you will reach your target element.

# Your code here along with comments explaining your approach

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        if matrix == None or len(matrix) == 0:
            return False
        
        m = len(matrix)
        n = len(matrix[0])
        i = m-1
        j = 0
        while i>=0 and j>=0 and i < m and j < n:
            
            if target == matrix[i][j]:
                return True
            
            elif target < matrix[i][j]:
                i = i-1
            elif target > matrix[i][j]:
                j = j+1
                
        return False
                
            
            
                
        