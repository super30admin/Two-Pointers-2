# Time Complexity: O(M+N), M: Number of row, N: Number of columns
# Space Complexity: O(1)

class Solution:
  # Code if we search from Bottom Left corner
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix == None or len(matrix[0])== 0:
            return False
        row = len(matrix)-1
        col = 0
        while row >= 0 and col < len(matrix[0]):
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] < target:
                col += 1
            else:
                row -=1
        return False


  # Code if we Search from top Right corner
    def searchMatrix2(self, matrix: List[List[int]], target: int) -> bool:
        if matrix == None or len(matrix[0])== 0:
            return False
        row = 0
        col = len(matrix[0])-1
        while row < len(matrix) and col >=0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] < target:
                row +=1
            else:
                col -= 1
        return False
