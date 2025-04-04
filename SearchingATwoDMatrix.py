# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# We are taking two pointers r and c. We are starting from the bottom left corner of the matrix. If the target is equal to the element at the r and c, we are returning true. If the target is less than the element at r and c, we are decrementing r. If the target is greater than the element at r and c, we are incrementing c. We are doing this until we reach the top right corner of the matrix. If we reach the top right corner of the matrix, we are returning false.

from typing import List
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        r = 0
        c = n-1
        while r < m and c >= 0:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                 c -= 1
            else:
                r += 1
        return False
