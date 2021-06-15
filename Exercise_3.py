class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n, m = len(matrix), len(matrix[0])
        
        lm, rm = 0, m-1
        
        midm = m//2
        f = False
        
        for i in range(n):
            while lm <= rm:
                midm = (rm + lm) //2
                val = matrix[i][midm]
                if val == target:
                    return True
                elif target < val:
                    rm = midm - 1
                else:
                    lm = midm + 1
            lm, rm = 0, m-1
            
        return False