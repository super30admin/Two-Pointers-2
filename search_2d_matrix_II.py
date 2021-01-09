class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        
        if len(matrix)==0 or len(matrix[0])==0:
            return False
        
        height = len(matrix)
        width = len(matrix[0])
        
        row = height-1
        col = 0
        
		## Starting at bottom left
		
        while row>=0 and col<width:
            
            if matrix[row][col]>target:
                row-=1
            
            elif matrix[row][col]<target:
                col+=1
            else:
                return True
            
        return False
		
		
#Time - O(m+n)
#Space - O(1)