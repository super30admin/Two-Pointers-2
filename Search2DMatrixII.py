# TC: O(m+n) where m is the number of rows and n is the number of columns.
# SC: O(1) since we are not using any extra space. 

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or len(matrix) == 0: 
            return False 
        r = 0 
        c = len(matrix[0]) - 1
        while r < len(matrix) and c >= 0: 
            if matrix[r][c] == target: 
                return True 
            elif matrix[r][c] > target: 
                c -=1
            else: 
                r += 1
        return False 
        
