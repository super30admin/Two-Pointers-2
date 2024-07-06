# // Time Complexity : O(n) 
# // Space Complexity : O(1)   
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : No because i attended the class and then did the solution

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        left = len(matrix[0]) -1
        down = 0

        while left >= 0 and down < len(matrix):
            if matrix[down][left] < target:
                down += 1
            elif matrix[down][left] == target:
                return True
            else:
                left -= 1
        
        return False
    
# Approach:
# Same as taught in the class