"""
Start from the bottom-left corner of the matrix.
If the number is bigger, move up; if it's smaller, move right.
Keep going until you find the target or run out of bounds.
"""

#Time Complexity:O(M+N)
#Space Complexity: O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        r, c = m - 1, 0

        while r >= 0 and c < n:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                r -= 1
            else:
                c += 1

        return False