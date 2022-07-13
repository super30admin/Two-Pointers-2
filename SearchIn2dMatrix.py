#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return False
        
        m=len(matrix)
        n=len(matrix[0])
        
        row = m - 1
        col = 0
        
        while col<n and row>=0:
            if matrix[row][col]>target:
                row-=1
            elif matrix[row][col]<target:
                col+=1
            else:
                return True
        return False     
                
                
                
        