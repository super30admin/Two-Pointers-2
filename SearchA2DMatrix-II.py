# TC: O(rows + cols)
# SC: O(1)
# LeetCode: Y(https://leetcode.com/problems/search-a-2d-matrix-ii/)
# Approach: Start from the top-right or bottom-left
#           Start from top-right
#           if the target is greater than current element then move down
#           if the target is smaller than current element then move left
#           top-right and bottom-left work because on one side of these points the elements will be decreasing, the other side it will be increasing

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # get dimensions
        rows, cols = len(matrix), len(matrix[0])
        
        # intialize two-pointers from top-right
        i, j = 0, cols - 1
        
        # loop until two pointers are within the matrix dimensions
        while(i < rows and j >= 0):
            
            # if target is found in the matrix then return True
            if matrix[i][j] == target:
                return True
            
            # if target exceeds the current element move down in the direction of greater elements
            elif target > matrix[i][j]:
                i += 1
                
            # else move left in the direction of smaller elements
            else:
                j -= 1
         
        # return False as target was not found in the matrix
        return False
