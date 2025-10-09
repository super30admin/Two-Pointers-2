# Time Complexity : O(m + n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Approach:
# Start from the top-right corner of the matrix.
# If the number is larger than the target, move left; if smaller, move down.
# Keep searching until the number is found or indices go out of bounds.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)      # total rows
        n = len(matrix[0])   # total columns

        r, c = 0, n - 1      # start from top-right corner

        # Keep searching while we are inside the matrix
        while r < m and c >= 0:
            # Found the target
            if matrix[r][c] == target:
                return True
            # If current number is greater, move left
            elif matrix[r][c] > target:
                c -= 1
            # If current number is smaller, move down
            else:
                r += 1

        # If we exit the loop, the target was not found
        return False
