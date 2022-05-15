# Time complexity: O(m + n) where m is the number of rows and n is the number of columns of the matrix.
# Space complexity: O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) == 0: return false
        m = len(matrix)
        n = len(matrix[0])
        # Start from lower left.
        i = m - 1
        j = 0
        while i >= 0 and j < n:
            if matrix[i][j] < target:   # Move right for bigger value.
                j += 1
            elif matrix[i][j] > target: # Move up for smaller value.
                i -= 1
            else:
                return True
        return False