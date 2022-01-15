# Time Complexity : O(m+n)
# Space Complexity : O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # Start with the top right corner (We can also do the same process from bottom left corner)
        row = 0
        col = len(matrix[0]) - 1
        
        while row < len(matrix) and col >= 0:
            # Traverse through the same row 
            if target < matrix[row][col] :
                col = col - 1
                
            # tranverse through the next row
            elif target > matrix[row][col] :
                row = row + 1
            
            else : 
                return True
        return False