## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
#Time Complexity : O(m+n), m=number of rows and n=number of columns
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if len(matrix)==0:
            return False
        m=len(matrix)
        n=len(matrix[0])
        i=0
        j=n-1;
        while(i<m and j>=0):
            if matrix[i][j]==target:
                return True
            # if greater then you should move to smaller element in that list
            elif matrix[i][j]> target:
                j-=1
            else:
                i+=1
        return False
                
        
            
            
        