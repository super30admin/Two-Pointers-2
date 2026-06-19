# Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
# Time Complexity: O(m + n), row only increases up to m times, column only decreases up to n times
# Space Complexity: O(1), only a few extra variables used, no extra data structures

# We start from the top-right corner, where left means smaller and down means bigger.
# We compare the current value to the target and move left if too big, or down if too small.
# We keep narrowing the search until we find the target or move out of the matrix bounds.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)        # number of rows
        n = len(matrix[0])     # number of columns

        row, column = 0, n-1   # start at top-right corner: row 0, last column

        while row < m and column >= 0:   # keep searching while still inside the matrix bounds
            if matrix[row][column] == target:   # found the target
                return True
            elif matrix[row][column] > target:  # current value too big, target can't be right or below
                column -= 1                      # move left to find a smaller value
            else:                            # current value too small, target can't be left or above
                row += 1                          # move down to find a bigger value

        return False   