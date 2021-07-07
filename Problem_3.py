# Runs on Leetcode
# Runtime Complexity: O(log (m*n))-- m is number of rows and n is number of columns
# Memory complexity: O(1)


'''
1) Initialized pointers row and col at len(matrix)-1 and 0 respectively

2) While iterating till row is greater than or equal to zero & col is less than len(matrix[0]).

3) If value in matrix at this (row, col) index is greater than target, row pointer is decreased. If the vaue is less than 
target, row pointer is fixed and col pointer is increased.

4) If value at index is equal to target, boolen True is returned

5) If no value is returned even when while loop ends. Boolen False is returned

'''

class Solution:
    def searchMatrix(self, matrix, target):
        if not matrix:
            return False
            
        row = len(matrix) - 1
        col = 0
        
        while row >= 0 and col < len(matrix[0]):
            if matrix[row][col] > target:
                row -= 1
            elif matrix[row][col] < target:
                col += 1
            else:
                return True
        return False
