# Time Complexity : O(N)
# Space Complexity : O(1)
# Approach to solve this problem:(Given below)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        r, c = 0, len(matrix[0])-1                  # Declaration
        
        while r < len(matrix) and c >= 0:           # Termination state to keep going
            if target == matrix[r][c]:              # if target is 15
                return True
            elif target > matrix[r][c]:             # if greater than 15 increment row by 1
                r += 1                              
            else:
                c -= 1                              # else decrement col by 1
        return False
        
        