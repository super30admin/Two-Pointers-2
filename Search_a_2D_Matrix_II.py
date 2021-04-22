class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix:
            return False
        
        m = len(matrix)
        n = len(matrix[0])
        i , j = 0, n-1
        while i < m and j >= 0:
            if matrix[i][j] == target:
                return True
            
            elif matrix[i][j] < target :
                i += 1
            else:
                j -= 1
       
        return False
        
        
