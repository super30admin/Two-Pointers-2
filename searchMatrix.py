class Solution:
    def searchMatrix(self, matrix, target):
        
        
		## TIME COMPLEXITY : O(N + M) ##
		## SPACE COMPLEXITY : O(1) ##
                
        i, j = len(matrix) - 1, 0
        while(i >= 0 and i < len(matrix) and j >=0 and j < len(matrix[0])):
            if(matrix[i][j] == target): return True
            if(matrix[i][j] > target):  i -= 1
            if(matrix[i][j] < target):  j += 1              
        return False
        
        
        
 '''First, we initialize a (row, col) pointer to the bottom-left of the matrix.
 If the currently-pointed-to value is larger than target we can move one row "up", 
 Otherwise, if the currently-pointed-to value is smaller than target, we can move one column "right".
 tc o(m+n), sc o(1)'''
