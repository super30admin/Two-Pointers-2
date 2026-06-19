## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        """
        Time Complexity: O(M + N) 
        - Where M is the number of rows and N is the number of columns.
        - In the worst-case scenario, the algorithm traverses from the top-right 
          corner to the bottom-left corner, making at most M steps down and N steps left.
        
        Space Complexity: O(1)
        - We only use a constant amount of extra space for the row and col pointers, 
          regardless of the size of the input matrix.
        """
        
        # Get the dimensions of the matrix
        rows = len(matrix)
        cols = len(matrix[0])
        
        # Initialize pointers to start at the top-right corner of the matrix
        row = 0
        col = cols - 1
        
        # Loop continues as long as the pointers are within the matrix boundaries
        while row >= 0 and row < rows and col < cols and col >= 0:
            
            # If the current element matches the target, we are done
            if matrix[row][col] == target:
                return True
            
            # If the current element is greater than the target:
            # Since columns are sorted top-to-bottom, everything below this element 
            # is also strictly greater than the target. Thus, we can safely eliminate 
            # this entire column and move left.
            if matrix[row][col] > target:
                col -= 1
                
            # If the current element is strictly less than the target:
            # Since rows are sorted left-to-right, everything to the left of this 
            # element is also strictly less than the target. Thus, we can safely 
            # eliminate this entire row and move down.
            else:
                row += 1
                
        # If the loop finishes without returning True, the target is not in the matrix
        return False