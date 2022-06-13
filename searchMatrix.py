class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = 0  # since 15 is at 0th row
        col = len(matrix[0]) - 1  # since it is 2d matrix

        while (row < len(matrix) and col >= 0):
            if (matrix[row][col] == target):
                return True
            elif (matrix[row][col] < target):
                row += 1
            else:
                col -= 1
        return False
