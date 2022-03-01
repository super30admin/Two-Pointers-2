class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        if matrix is None or len(matrix) == 0:
            return False

        i = 0
        j = len(matrix[0]) - 1

        while i < len(matrix) and j > -1:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                j -= 1
            else:
                i += 1

        return False
