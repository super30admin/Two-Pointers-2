#Time Complexity O(m+n)
#Space Complexity O(1)

class Solution:
    
    
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix==None or len(matrix)==0:
            return False
        cur_1 = 0
        cur_2 = len(matrix[0])-1
        counter = 0
        i=0
        j=len(matrix[0])-1
        
        while i< len(matrix) and j>=0:
            if matrix[i][j]==target:
                return True
            
            if matrix[i][j]>target:
                j-=1
                
            if matrix[i][j]<target:
                i+=1
                
        return False
        
        # for x in range(len(matrix)):
        #     if matrix[x][cur_1] == target or matrix[x][cur_2] == target:
        #         return True
        #     if matrix[x][cur_1]< target and matrix[x][cur_2] > target:
        #         self.getresult(matrix,)
                
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        return False
#         if matrix==None or len(matrix)==0:
#             return False
        
#         m = len(matrix)-1
#         n = len(matrix[0])
#         i = 0
#         j=0
#         for x in range(len(matrix)):
#             for y in range(len(matrix[0])):
#                 if matrix[x][y] == target:
#                     return True
                
            
#         return False
        
        
        
