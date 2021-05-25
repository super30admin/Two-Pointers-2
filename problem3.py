class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        r = 0
        c = len(matrix[0])-1
        while(r<len(matrix) and c>=0):
            if matrix[r][c]==target:
                return True
            elif matrix[r][c]>target:
                c = c - 1
            elif matrix[r][c]<target:
                r = r + 1
        return False
        
