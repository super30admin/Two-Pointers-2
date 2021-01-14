# Time Complexity : O(m+n) m : no.of rows and n : no.of columns
# Space Complexity: O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Start from top right corner of the matrix, if num is the target return true.
#           if num < target move down or else move left
 
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        r = 0
        c = len(matrix[0])-1
      
        while r<len(matrix) and c>=0:
            num = matrix[r][c]
            if num == target:
                return True
            
            if num < target:
                r = r+1
            else:
                c = c-1
                
        return False