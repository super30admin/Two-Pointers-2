# Time Complexity : O(M + N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''Since, we know the rows and columns are sorted we can start on the right corner of the matrix. 
If the target is less than current element we know we should move along the row. 
If it is larger then move along the column. Return when found.
'''

# Your code here along with comments explaining your approach
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        row = 0
        col = len(matrix[0]) - 1
        
        while row < len(matrix) and col > - 1:
            
            if target == matrix[row][col]:
                return True
            elif target < matrix[row][col]:
                col -= 1
            else:
                row += 1
        
        
        return False
            
