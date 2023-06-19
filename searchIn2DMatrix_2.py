from typing import List
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return False

        height = len(matrix) -1
        width = len(matrix[0]) -1
        
        col = 0
        row = height

        while col <= width and row >= 0:
            if matrix[row][col] == target :
                return True
            elif matrix[row][col] > target :
                row -= 1
            else:
                col += 1
        
        return False