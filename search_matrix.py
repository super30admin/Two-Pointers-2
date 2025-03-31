# Approach:
# Start the search from the top-right corner of the matrix to take advantage of the sorted rows and columns.
# If the current value is greater than the target, move left to eliminate a column; if it's less, move down to eliminate a row.
# This allows us to eliminate one row or column in each step, efficiently narrowing down the search space.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or not matrix[0]:
            return False

        rows, cols = len(matrix), len(matrix[0])
        row, col = 0, cols - 1

        while row < rows and col >= 0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] > target:
                col -= 1
            else:
                row += 1

        return False

# Time Complexity: O(m + n), where m = number of rows and n = number of columns.
# Space Complexity: O(1), as no extra space is used apart from a few variables.
