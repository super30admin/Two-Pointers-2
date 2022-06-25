class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m,n=len(matrix), len(matrix[0])
        
        r=m-1
        c=0
        
        while r>=0 and c<=n-1:
            if matrix[r][c]>target:
                r-=1
                
            elif matrix[r][c]<target:
                c+=1
                
            else:
                return True
            
        return False
        