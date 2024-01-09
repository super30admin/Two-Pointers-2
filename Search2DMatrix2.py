
#Time : O(m+n)
#Space O(1) 


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        i = 0
        j = m-1 

        if(len(matrix) ==0 or matrix == 0):
            return False
        while(i<n and j >=0):
            if target == matrix[j][i]:
                return True
        
            if target > matrix[j][i]:
                i+=1
            elif target < matrix[j][i]:
                j-=1 
            
        return False
