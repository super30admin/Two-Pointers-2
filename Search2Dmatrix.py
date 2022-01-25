"""

Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-10^4 <= matrix[i][j], target <= 10^4

"""

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on leetCode : Yes
# Any problem you faced while coding this :  No

from typing import List

class Solution:
    
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        m = len(matrix)         # rows 
        n = len(matrix[0])      # columns
        
        i = 0       # pointers
        j = n - 1
        
        # as long as there are elements in the matrix
        while i < m and j >= 0: 
            
            # make current matrix value as the value of variable ele
            ele = matrix[i][j]
            
            # if current value is the search value we are looking for, return True
            if ele == target:
                return True
            
            # if current value is less than target, decrement/increment pointers accordingly
            elif target < ele:
                j -= 1
            else:
                i += 1
        
        # return false if value not found
        return False
            
