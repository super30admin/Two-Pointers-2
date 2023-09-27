# Time Complexity: O(m+n) m: no of rows n: no of columns
# Space Complexity : O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i = 0
        j = len(matrix[0]) - 1

        while i < len(matrix) and j >= 0:
            pointer = matrix[i][j]

            if target == pointer:
                return True
            elif target < pointer:
                j -= 1
            else:
                i += 1

        return False