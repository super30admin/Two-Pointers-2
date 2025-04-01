# Time Complexity: O(m+n), wehre m = number of rows, n = number of columns
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach:
# We observe that if we stand at the top right corner element, all the elements to its left will be lower and all the elements below it will be greater.
# 1. We start from the element at top right corner.
# 2. If the element is greater than target, it means that the column we're at, wouldn't contain the target, so we check in the previous column
# 3. If the element is smaller than the target, it means that we wouldn't find find the target element in that row, so we check in the next row

from typing import List
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m, n = len(matrix), len(matrix[0])
        # Initialize row and column at the top right corner
        r, c = 0, n-1

        # Iterate through the matrix until either row or column goes out of bounds
        while r < m and c >= 0:
            # If the target is found, we return True
            if matrix[r][c] == target:
                return True
            # If the element at row and column is smaller than the target, we increment the row
            if matrix[r][c] < target:
                r += 1
            # If the element at row and column is larger than the target, we decrement the column
            elif matrix[r][c] > target:
                c -= 1
        # Finally, if our search doesn't find the target element, we return False.
        return False