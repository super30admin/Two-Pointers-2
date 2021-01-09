class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #Time Complexity: O(len(matrix) + len(matrix[0]))
        #Space Complexity: O(1)
        
        row, col = 0, len(matrix[0]) - 1
        
        while row < len(matrix) and col >= 0:
            if target == matrix[row][col]:
                return True
            elif target < matrix[row][col]:
                col -= 1
            else:
                row += 1
        
        return False