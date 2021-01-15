#Time Complexity :O(n+m)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this : tried running sum.
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if(len(matrix)==0 or matrix==None):
            return False
        m=len(matrix)
        n=len(matrix[0])
        
        row=0
        column=n-1
        
        while(row<m and column>=0):
            if(matrix[row][column]==target):
                return True
            
            if(matrix[row][column]>target):
                column-=1
            else:
                row+=1
        return False
                
                

            