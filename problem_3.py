"""
Problem: Search a 2D Matrix II
TC: O(m+n)
SC: O(1)
Approach: Start from the top right corner of the matrix. If the target is greater than the current element, move down. If the target is less than the current element, move left. If the target is equal to the current element, return True. If the target is not found, return False.

"""

from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix:
            return False

        row = 0
        col = len(matrix[0] ) -1

        while row < len(matrix) and col >= 0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] < target:
                row +=1
            else:
                col -=1

        return False