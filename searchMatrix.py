class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix:
            return False
        
        m = len(matrix) # row
        n = len(matrix[0]) # col
        row = 0
        col = n - 1
        
        while row<m and col >= 0:
            if matrix[row][col] > target:
                col -= 1
            elif matrix[row][col] < target:
                row += 1
            else:
                return True
        
        return False
    
# Starting search diagonally in sorted matrix to take advantage of it being in middle
# TC: O(M+N) SC: O(1)