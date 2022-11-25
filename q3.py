from typing import List
# Time Complexity : O(m+n), Where m,n are number of rows and number of columns in given 2D matrix
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''
Here we have two pointers i,j(one for row and another for column), intially they are assigned to 0,n-1
We will move down or left based on the target value
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=len(matrix)#Number of rows
        n=len(matrix[0])#Number of columns
        i,j=0,n-1
        while(i in range(0,m) and j in range(0,n)):
            if(target<matrix[i][j]):
                #Move left
                i,j=i,j-1
                continue
            if(target>matrix[i][j]):
                #Move Down
                i,j=i+1,j
                continue
            if(target==matrix[i][j]):
                return True
        
        return False