# Approach:
# Start searching from the top-right corner of the matrix, where each step reduces the search space efficiently.
# If the target is smaller than the current element, move left; if it is larger, move down.
# This process allows us to eliminate a row or column in each step until we find the target or exhaust the matrix.

# Time Complexity: O(m + n), where m is the number of rows and n is the number of columns
# Space Complexity: O(1), as we use a constant amount of extra space
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # Start at the top-right corner
        row, col = 0, len(matrix[0]) - 1

        # Iterate until we move out of bounds
        while row < len(matrix) and col >= 0:
            if matrix[row][col] == target:  # Check if the current element is the target
                return True
            elif matrix[row][col] > target:  # Move left if the current element is greater than target
                col -= 1
            else:  # Move down if the current element is less than target
                row += 1

        return False  # Return False if the target is not found
