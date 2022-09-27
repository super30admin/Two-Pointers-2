#TC:O(N)
#SC:O(mn)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row, col, num_row = 0, len(matrix[0]) - 1, len(matrix)
        while col >= 0 and row < num_row:
            if matrix[row][col] > target:
                col -= 1
            elif matrix[row][col] < target:
                row += 1
            else:
                return True
        return False