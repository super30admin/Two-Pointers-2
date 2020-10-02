"""
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
Example:

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.
"""
class Solution:
    def searchMatrix(self, matrix, target):
        """
        We can choose either right top or bottom left as our starting point. because if the value is small we can move in one direction if target is larger we can move to other direction.
        """
        # Run time complexity : O(N+M)
        # Space Complexity : O(1)
        if not matrix:
            return False
        row = 0
        col = len(matrix[0])-1
        
        while row < len(matrix) and col > -1:
            if matrix[row][col] < target:
                row += 1
            elif matrix[row][col] > target:
                col -= 1
            else:
                return True
        return False
        