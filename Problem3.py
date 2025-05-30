"""
Implemented using the two-pointer approach
Time Complexity: O(m + n)
Space Complexity: O(1)
"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix)
        columns = len(matrix[0])
        r = 0
        c = columns - 1
        while r < rows and c >= 0:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] < target:
                r += 1
            else:
                c -= 1
        return False