# Approach:
# We are searching for a target in a 2D matrix where:
# - Each row is sorted in ascending order from left to right.
# - Each column is sorted in ascending order from top to bottom.
# 
# To efficiently search the matrix, we start from the bottom-left corner:
# - If the current element is less than the target, we move right (increase column).
# - If the current element is greater than the target, we move up (decrease row).
# - If we find the target, we return True.
# - If we exit the loop without finding the target, we return False.
#
# Time Complexity (TC): O(rows + cols)
# - In the worst case, we traverse through the number of rows + columns, as we either
#   move right or up in each step.
#
# Space Complexity (SC): O(1)
# - We are using constant space as no extra space is used apart from variables to track
#   rows and columns.

class Solution(object):
    def searchMatrix(self, matrix, target):
        rows = len(matrix) 
        cols = len(matrix[0]) 

        r, c = rows - 1, 0  # Start from bottom-left corner

        while r >= 0 and c < cols:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] < target:
                c += 1  # Move right
            else:
                r -= 1  # Move up
            
        return False
