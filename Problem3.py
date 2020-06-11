"""
// Time Complexity : o(m+n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
--> starting from the last leftmost element, we find our way towards our target element 
"""
class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix:
            return False
        
        row = len(matrix)
        col = len(matrix[0])
        
        row_ptr = row - 1 #we will start our search the last leftmost element
        col_ptr = 0
        
        while row_ptr >= 0 and col_ptr <= col - 1: #while the pointers are in bounds. if element doesnt exist, the loop will exit and return False 
            
            if matrix[row_ptr][col_ptr] == target: #when found
                return True
            
            elif matrix[row_ptr][col_ptr] < target: # if current value is smaller, we go right
                col_ptr +=1
            
            else: # if current value is bigger, we go up
                row_ptr -= 1
                
        return False