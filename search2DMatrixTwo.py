"""
Problem: Search a 2D Matrix II
------------------------------
Write an efficient algorithm that searches for a target value in an m x n matrix.
Each row is sorted in ascending order from left to right, and each column is sorted
in ascending order from top to bottom.

Approach (One-liner):
Start from the top-right corner and eliminate one row or one column in each step.

Time Complexity: O(m + n)
Space Complexity: O(1) — constant extra space
"""

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        """
        Searches for 'target' in a sorted 2D matrix using an efficient elimination method.
        """

        # Number of rows (m) and columns (n)
        m = len(matrix)
        n = len(matrix[0])

        # Start at the top-right corner
        row = 0
        col = n - 1

        # Traverse the matrix until we move out of bounds
        while row < m and col >= 0:

            # If the current element matches the target, we found it
            if matrix[row][col] == target:
                return True

            # If current element is greater than target,
            # move left to find smaller values
            elif matrix[row][col] > target:
                col -= 1

            # If current element is smaller than target,
            # move down to find larger values
            else:
                row += 1

        # If we exit the loop, the target does not exist in the matrix
        return False
