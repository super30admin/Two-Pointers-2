"""
time - o(n)
space - o(1)
we start at the top right most element of the matrix since the rows and columsn are sorted if the number if lesser than target we go to the left
if greater we move down till we find the element or exit the matrix
"""

from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        x, y = 0, len(matrix[0]) - 1
        while 0 <= x < len(matrix) and 0 <= y < len(matrix[0]):
            num = matrix[x][y]
            if num == target:
                return True
            elif target < num:
                y -= 1
            else:
                x += 1

        return False
