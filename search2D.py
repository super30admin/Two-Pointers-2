# Time Complexity : O(m + n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Start from the bottom-left corner and eliminate one row or column at each step.
# If target is greater, move right, if smaller, move up, until found or indices go out of bounds.


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        r,c = len(matrix) - 1,0

        while r >= 0 and c < len(matrix[0]):
            if matrix[r][c] == target:
                return True
            elif target > matrix[r][c]:
                c += 1
            else:
                r -= 1
        return False






