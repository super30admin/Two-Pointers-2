class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        l, r = 0, len(matrix[0])-1
        
        while l < len(matrix) and r >= 0:
            if target == matrix[l][r]:
                return True
                
            if target < matrix[l][r]:
                r -= 1
            elif target > matrix[l][r]:
                l += 1
        
        return False
