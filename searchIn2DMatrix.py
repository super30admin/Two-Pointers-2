"""
Intuition: Start from top-right or bottom left positions because at these 2 positions 
we can make a clear cut decisions on where to move wrt the target value.
#####################################################################
Time Complexity : O(M+N) where M+N = total elements
Space Complexity : O(1) 
#####################################################################
"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        i, j = 0, len(matrix[0]) -1

        rows = len(matrix)
        cols = len(matrix[0])
        while i < rows  and j >= 0:
            currentNum = matrix[i][j]
            if currentNum == target:
                return True
            if currentNum > target:
                j -=1
            else:
                i += 1
        return False
            
        
    