# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to initialize a pointer at the end of the first row last column or diagonally opp then traverse the 2D mat either left
# or bottom by comparing the row elements with the search target then return the index.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=len(matrix[0])
        n=len(matrix)
        j=m-1
        i=0
        while(i<n and j>=0):
            if (matrix[i][j]==target):
                return True
            
            elif((matrix[i][j]<target)):
                i+=1
            else:
                j-=1


        return False