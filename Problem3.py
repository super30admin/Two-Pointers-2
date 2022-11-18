
# // Time Complexity : O(m+n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

# The given array is in sorted manner (row & columns both) 
# so we can start from top right or bottom left and compare the value.
# If target value is grater than current matrix[r][c] than move to next row (increment the row) 
# and if value is less than target the decrement the column 

# // Your code here along with comments explaining your approach

class Solution:
    def searchMatrix(self, matrix: List[List[]], target: int) -> bool:
        
        #top right to bottom left approach
        
        rows = len(matrix)
        cols = len(matrix[0])
        
        #starting from first row , last column 
        
        r = 0
        c = cols-1
        
        #running loop till end of first column , last row
        while (r < rows and c >= 0):
            if(matrix[r][c] == target):
                return True
            elif(target > matrix[r][c]): #if target > matrix index than change index to next row but keep index in same column
                r+=1
            else: #if target < matrix index than change index to next column keep index in same row
                c-=1
        return False