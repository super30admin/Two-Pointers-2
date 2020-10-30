'''// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : 
// Your code here along with comments explaining your approach
'''


class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        if matrix ==0 or len(matrix)==0 or len(matrix[0])==0:
            return False
            
        row=len(matrix)
        col=len(matrix[0])
        
        i=row-1
        j=0
        
        while(i>=0 and j<=col-1):
            if matrix[i][j]==target:
                return True
            
            if matrix[i][j]<target:
                j=j+1
                
            else:
                i=i-1
        
        return False
