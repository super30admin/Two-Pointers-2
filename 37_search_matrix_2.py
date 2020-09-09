# S30 Big N Problem #37 {Medium}

# Search a 2D Matrix II

# Time Complexity : O(m*n) m= no. of columns, n=no. of rows
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Approach 
# start with bottom left corner of the matrix
# if the element is greater than target, decrement row pointer
# if element is smaller than target, increment column pointer
# execute till all the rows and columns are consumed 


class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        
        m=len(matrix)
        
        if m==0:
            return False
        n=len(matrix[0])
        
        i=m-1
        j=0
        while i>=0 and j<n:
            
            if matrix[i][j]==target:
                return True
            elif matrix[i][j]>target:
                i-=1
            else:
                j+=1
        
        return False
                
                
                