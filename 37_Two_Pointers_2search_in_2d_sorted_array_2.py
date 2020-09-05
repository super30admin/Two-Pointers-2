class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        if len(matrix)==0:
            return False
        
        no_of_rows=len(matrix)
        no_of_cols=len(matrix[0])
        i=0
        j=no_of_cols-1
        
        
        while i<no_of_rows and j>=0:
            
            if matrix[i][j]==target:
                return True
            elif matrix[i][j]>target:
                j-=1
            elif matrix[i][j]<target:
                i+=1
        
        return False
                
        
        
                