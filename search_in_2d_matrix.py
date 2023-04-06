# Time Complexity: O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
In this code we are searching for a target value in a 2D matrix by moving left or down 
based on how our target compares to the current value of the matrix. We are able to do 
this only becuase the matrix is sorted in a manner.
"""

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        row = 0
        column = n - 1

        while row < m and column >= 0 :
            if matrix[row][column] == target:
                return True
            elif matrix[row][column] > target:
                column -=1
            else:
                row += 1
                
        return False