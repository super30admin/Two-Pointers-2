class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        r=0
        c=len(matrix[0])-1

        while r>=0 and c>=0 and r<len(matrix) and c<len(matrix[0]):
            print(str(r)+" "+str(c))
            if matrix[r][c]==target:
                return True
            if matrix[r][c]>target:
                c-=1
            else:
                r+=1
            
        return False  
        