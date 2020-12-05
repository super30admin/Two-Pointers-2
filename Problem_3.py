# Search a 2d Matrix II

# Time Complexity : O(M+N)
# Space Complexity : O(1) as no extra space is used.
# Did this code successfully run on Leetcode : Yes, Runtime: 160 ms and Memory Usage: 20.4 MB
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
# Approach
"""
Using 2 pointer approach traversing to search the element.

"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if(matrix==None or len(matrix)==0): # Edge Cases
            return False
        m=len(matrix)
        n=len(matrix[0])
        i=0
        j=n-1
        while(i<m and j>=0):
            if(matrix[i][j]==target): 
                return True
            elif(target > matrix[i][j]):
                i=i+1 # Row Increment
            else:
                j=j-1  # Column Decrement
        return False
        