"""
Approach: Need not start from the first element always. Start from a corner from where you can make firm decision on
the path.

"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        len_row = len(matrix)
        len_col = len(matrix[0])
        i = 0
        j = len_col -1

        while i < len_row and j > -1:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                j -= 1
            else:
                i += 1
        return False

"""
TC: O(n)
SC: O(1)
"""