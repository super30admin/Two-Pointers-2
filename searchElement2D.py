'''
Timecomplexity O(m+n)
Spacecomplexity O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
'''

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        if len(matrix) == 0: return False
        
        m =  len(matrix) 
        n = len(matrix[0]) 
        
        i =  0
        j = n-1
        
        #Traverse from the upper right index through the array by moving left if the element is greater
        # or move down if the element is lower
        while(i<m and j>=0):
            if matrix[i][j] ==  target:
                return True
            elif matrix[i][j] > target:
                j-=1
            else:
                i+=1
        
        return False
        
        