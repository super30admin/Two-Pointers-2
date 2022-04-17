class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=len(matrix)
        n=len(matrix[0])
        i=m-1
        j=0
        while(i>=0 and j<n):
            if(matrix[i][j]==target):
                return True
            elif target>matrix[i][j]:
                j+=1
            else:
                i-=1
        return False