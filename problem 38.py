#  https://leetcode.com/problems/search-a-2d-matrix-ii/

# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES 
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach



class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix[0]) # no of columns
        n = len(matrix) # no of rows
        r = 0
        c = m - 1
        # we are at right top corner 
        while r < n and c >=0: 
            if(matrix[r][c] == target): # return true if target is found
                return True
            elif matrix[r][c] > target: #if it's > target go left
                c -= 1 
            else: # else go down
                r += 1
        return False
        