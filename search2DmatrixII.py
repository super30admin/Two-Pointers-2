class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        if matrix == None or len(matrix)==0:
            return False
        
        m=len(matrix)
        n=len(matrix[0])

        #starting from upper right cornor
        # row = 0
        # col = n-1
        # while col >=0 and row < m:
        #     if target == matrix[row][col]:
        #         return True
        #     elif target > matrix[row][col]:
        #         row+=1
        #     else:
        #         col-=1
        # return False


        #starting from lower left cornor
        col=0
        row=m-1
        while row>=0 and col<n:
            if target == matrix[row][col]:
                return True
            elif target > matrix[row][col]:
                col+=1
            else:
                row-=1
        return False
    
    
#time complexity -> O(m+n)
#space complexity -> O(1)