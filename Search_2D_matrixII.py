#Time Complexity : O(m+n)

#Space Complexity : O(1) 

#Did this code successfully run on Leetcode : Yes

#Any problem you faced while coding this :None

# =============================================================================
# Solution: Start from a corner which is increasing in one direction and decreasing in other direction, so that if target is less 
#than that number, then move in decreasing direction, else move in increasing direction. If you out of bounds, meaning target doesn't exist else return True.
# =============================================================================

class Solution:
    def searchMatrix(self, matrix, target):
        if matrix is None or len(matrix) == 0:
            return False
        ht = len(matrix)
        width = len(matrix[0])
        row = ht -1
        col = 0
        while col < width and row >=0:
            if target < matrix[row][col]:
                row -= 1
            elif target > matrix[row][col]:
                col += 1
            else:
                return True
        return False