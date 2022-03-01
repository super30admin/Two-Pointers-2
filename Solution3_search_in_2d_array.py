// Time Complexity : O(log (m*n)) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



'''
1) Initialize pointers row and col at len(matrix)-1 and 0 respectively
2) While iterating till row is greater than or equal to zero & 
   col is less than column length
3) If value in matrix at [row, col] index is greater than target,
   row pointer is decreased.
4)   If the vaue is less than target, row pointer is fixed and 
   col pointer is increased.
5) If value at index is equal to target, return True
6) return False at end
'''

#Search in a 2D matrix	
class Solution:
    def searchMatrix(self, matrix, target):
        m=len(matrix)
        
        if m==0: return False
        
        n=len(matrix[0])
        
        i=0
        j=n-1
        
        while (i<m and j>=0):
            
            if matrix[i][j]==target:
                return True
            else:
                if matrix[i][j]<target:
                    i=i+1
                else:
                    j=j-1
        return False
        