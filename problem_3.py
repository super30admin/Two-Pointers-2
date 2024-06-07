# Time O(row + col)
# Space O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix:
            return False 
        m = len(matrix)
        n = len(matrix[0])
        row = 0 
        col = n - 1 
        while row < m and col >= 0:
            if matrix[row][col] == target:
                return True 
            elif matrix[row][col] < target:
                row += 1
            else:
                col -= 1
        return False
        