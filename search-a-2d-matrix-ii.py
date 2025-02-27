# Approach:
# We start from the bottom-left corner of the matrix (i = ROWS - 1, j = 0). 
# If the current element is equal to target, we return True. If it's greater than target, we move up (decrease i). 
# If it's smaller, we move right (increase j). This works because the matrix is sorted: each row is sorted in ascending order, 
# and each column is sorted in ascending order.

# Time & Space Complexity:
# Time Complexity: O(m+n) (At most one pass through rows and columns).
# Space Complexity: O(1) (Only a few integer variables are used).
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ROWS, COLS = len(matrix), len(matrix[0])
        i = ROWS - 1
        j = 0
        while i >= 0 and j < COLS:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                i -= 1
            else:
                j += 1
        return False
