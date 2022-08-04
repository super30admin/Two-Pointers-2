# Time complexity : O(m+n) --> m - number of rows and n - number of columns
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        
        # taking the position at top-right
        i = 0
        j = n - 1
        
        # traversing the matrix until I reach the other end-point, or my boundaries
        while i < m and j >= 0:
            # if target found, then return true
            if matrix[i][j] == target:
                return True
            # if the target is greater than the value at the current index, then we move down the row and same column
            elif matrix[i][j] < target:
                i += 1
            else:
            # else we move the column to the left within the same row
                j -= 1
              
        return False
