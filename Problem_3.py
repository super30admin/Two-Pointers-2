"""
Problem : 3

Time Complexity : O(m+n)
Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

creating two pinters pointing to the 1st and last element in first row
comparing the target with last pointer and decrementing it if number found to be
lesser and vice versa

"""

# Search 2D Matrix

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix==None or len(matrix)==0:
            return false
        
        m=len(matrix)
        n=len(matrix[0])

        i,j=0,n-1

        while i<m and j>=0:
            if matrix[i][j]==target:
                return True
            elif matrix[i][j]<target:
                i+=1
            else:
                j-=1
        return False