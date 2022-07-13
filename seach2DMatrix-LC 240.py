# Time Complexity = O(m + n)
# Space Complexity = O(1)

class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        if len(matrix) == 0:
            return False
        
        m = len(matrix)
        n = len(matrix[0])
        
        # Can choose either top right pointer or bottom left.
        # Solcing using top right
        # Pointer initialisation at top right ==> row = 0, col/top right pointer = n - 1
        row = 0
        tr = n - 1          # Top right pointer
        
        # Boundary conditions to avoid index out of bounds
        while (row <= m - 1 and tr >= 0):
            # If target is smaller than the pointer, moving leftwards
            if target < matrix[row][tr]:
                tr -= 1
            # If target is larger than the pointer, moving downwards    
            elif target > matrix[row][tr]:
                row += 1
            
            else:
                return True
        
        return False