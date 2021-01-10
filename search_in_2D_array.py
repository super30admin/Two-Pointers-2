# -*- coding: utf-8 -*-
"""
TC : O(MxN) where M = no of rows, N no. of columns
SC : O(1) as no extra space used
"""

class Solution:
    def searchMatrix(self, matrix:[[]], target: int) -> bool:
        #edge case check 
        if not matrix or len(matrix) == 0:
            return False
        
        m = len(matrix) #store number of rows in matrix
        n = len(matrix[0]) #store number of columns in the matrix
        i = 0 #starting index 0 
        j = n-1 #starting index from last column
        while i < m and j >= 0: #search begins from top right corner
            if matrix[i][j] == target: #if element is equal to target, return True
                return True
            elif matrix[i][j] > target: #if element is greater than target, move left in the matrix
                j -= 1 #decrement column index
            else:
                i += 1 #increment row index if element is less than target
        return False #return False, if search unsuccessful
    
S = Solution()
matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target = 5
print(S.searchMatrix(matrix,target))