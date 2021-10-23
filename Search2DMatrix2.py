"""
Time Complexity: O(m+n)
Space Complexity: O(1)
"""


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = len(matrix)
        col = len(matrix[0])

        # upper rightmost element
        r = 0
        c = col - 1

        while (r < row and c >= 0):
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                c -= 1
            elif matrix[r][c] < target:
                r += 1
        return False
