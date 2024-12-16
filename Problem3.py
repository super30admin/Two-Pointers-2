class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix) - 1
        columns = len(matrix[0]) - 1
        column = 0

        while rows >= 0 and column <= columns:
            start = matrix[rows][column]
            if target < start:
                rows = rows - 1
            elif target > start:
                column = column + 1
            else:
                return True

        return False
