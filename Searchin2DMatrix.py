# Time Complexity : O(m + n), m is no of rows and n is no of columns
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# starting with a corner that has 2 distinct directions
# start with with upper right corner
# on left values are decreasing, on moving down values are increasing

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix is None:
            return False
        
        m = len(matrix)
        n = len(matrix[0])
        # starting with upper right corner, so first row and last column
        row = 0
        col = n - 1
        # rows will increase and col with decrease
        while(row < m and col >= 0):
            # target found
            if matrix[row][col] == target:
                return True
            # value is greater, then we move in decreasing direction, columns decrease
            elif matrix[row][col] > target:
                col -= 1
            # value is smaller, then we move in increasing direction, rows increase
            else:
                row += 1
        
        return False

        
        