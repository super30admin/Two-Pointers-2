# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        i = len(matrix)
        j = len(matrix[0])

        # if the matrix is empty
        if i == 0 or j == 0:
            return False

        # start our pointer in bottom-left
        row = i - 1
        col = 0

        while col < j and row >= 0:
            # if target is found
            if matrix[row][col] == target:
                return True

            #target is greater
            elif matrix[row][col] < target:
                col = col + 1  # increment the column
            else:
                row = row - 1  # decrement the row

        return False
