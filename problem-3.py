"""
Approach

1. since the rows of the matrix and columns are sorted, we can start looking for the target from the top right corner of the matrix
2. if top right corner of the array is the target we return True
3. if top target is less than the top right corner, we know that target should be on left of top right corner, se we decrement the columns
4. if top target is greater than the top right corner, we know that target will be on the next row, so we increment j 

"""

# Time Complexity : O(m+n) where m is the no of rows and n is the no fo columns
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if(len(matrix)==0):
            return False
        
        rows = len(matrix)
        columns = len(matrix[0])
        i = 0
        j = columns-1
        while (i<rows and j >= 0):
            if matrix[i][j]==target:
                return True
                break
            elif target< matrix[i][j]:
                j-=1
            else:
                i+=1
        return False
                