class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix== None or len(matrix)==0:
            return False
        m= len(matrix)
        n= len(matrix[0])
        i=0
        j= n-1
        while(i<m and j>=0):
            if matrix[i][j]== target:
                return True
            elif matrix[i][j]< target:
                i+=1
            else:
                j= j-1
        return False
