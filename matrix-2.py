
#Time complexity: O(M+N) m is the number of rows and n is the number of columns in the matrix.
#Space Complexity: O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix==None or len(matrix)==0:
            return False
        m=len(matrix)
        n=len(matrix[0])
        #start from upper right
        row=0
        col=n-1

        while(row<m) and (col >=0):
            if matrix[row][col]== target:
                return True
            elif target > matrix[row][col]:
                row +=1
            else:
                col -=1
        return False
        
