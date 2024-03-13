# https://leetcode.com/problems/search-a-2d-matrix-ii/

# Time Complexity : O(N) where N is number of elements in the array.
# Space Complexity : O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

# Your code here along with comments explaining your approach.
# Approach - We can apply binary search. We can start out logic from top right element or bottom left element.
# We can compare our target with the value and if it is greater than the target move right [row + 1]
# If it less than the target we move [col - 1]. This rule is only applicable only if we start at top right corner.
# otherwise we can alter the rules.


from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix)
        cols = len(matrix[0])
        r, c = 0, cols - 1
        while r < rows and c >= 0:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                c -= 1
            else:
                r += 1
        return False
