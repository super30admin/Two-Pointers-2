class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        if matrix == None or len(matrix) == 0:
            return False

        m = len(matrix)    
        n = len(matrix[0])

        
        
        r = 0
        c = n-1
        while r < m and c >=0:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] < target:
                r = r + 1
            else:
                c = c -1

            
                

        return False                
