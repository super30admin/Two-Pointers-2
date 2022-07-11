"""
Runtime Complexity: O(m+n) - because we won't iterate through the entire rows(m) and columns(n). We will start from either top right or bottom left and check 
if the target is greater than the current element, if that's the case then we increment the row and see if the target lies on the next list else we go left by changing the column.
Space Complexity: O(1) - no extra space was created to compute the solution.
Yes, the code worked on leetcode.
Issues while coding this solution: None
"""


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) ==0:
            return False
        m = len(matrix)
        n = len(matrix[0])
        row = 0
        col = n-1
        #top down approach
        while row<m and col>=0:
           
            
            if target>matrix[row][col]:
                row+=1
            elif target < matrix[row][col]:
                col-=1
            else:
                return True
        return False
        
        