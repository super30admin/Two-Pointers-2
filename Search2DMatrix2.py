class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        m = len(matrix)
        n = len(matrix[0])
        
        # Starting position
        row = 0
        col = n - 1
        # Starting position can also be last row and first column
        
        
        # Running loop till row and col doesn't go out of bounds
        while (row < m and col >= 0):
            
            
            # If target is greater then move down
            if target > matrix[row][col]:
                row += 1
            # Else move left in the decreasing direction
            elif target < matrix[row][col]:
                col -= 1
            else:
                return True
            
        return False
    
    # Time Complexity: O(m + n) where m and n are the rows and columns respectively
    # Space Complexity: O(1) because no extra space is used