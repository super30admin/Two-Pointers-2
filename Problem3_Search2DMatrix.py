# Time Complexity: O(m + n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes

# Solution:
"""
1. Consider 2 pointers for row and column and start the search from the element in last row and first column.
2. Since all rows and columns are sorted in ascending order, decrease the row or increase the column to move towards target.
3. Return true if the target is found, else return false.
"""

def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
    if not matrix or len(matrix) is 0:
        return False

    rows = len(matrix)
    cols = len(matrix[0])

    # Start searching from last row and first column element
    row = rows - 1
    col = 0

    # Decrease the row or increase the col to move towards the target
    while row >= 0 and col < cols:
        if target == matrix[row][col]:
            return True
        elif target < matrix[row][col]:
            row -= 1
        else:
            col += 1

    return False