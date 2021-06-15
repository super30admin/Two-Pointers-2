"""
Time Complexity : O(m + n) - sum of number of rows and columns.
Space Complexity : O(1)
    
"""

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or len(matrix) == 0:
            return None 
        m = 0
        n = len(matrix[0]) - 1
        
        while n >= 0 and m < len(matrix):
            
            if matrix[m][n] == target:
                return True
            elif matrix[m][n] > target:
                n -= 1 
            elif matrix[m][n] < target:
                m += 1 
        
        return False 
                