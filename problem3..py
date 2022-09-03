"""
Time Complexity : O(m+n)
Space Complexity : O(1) No new data structure is used
Did this code successfully run on Leetcode :
Three line explanation of solution in plain english:
Strat from either top corner element row = 0, col = lastColumn.
If element[rowPtr][colPtr] > target col-- 
If element[rowPtr][colPtr] < target row++

// Your code here along with comments explaining your approach
"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) == 0:
            return False
        rows = len(matrix)
        cols = len(matrix[0])
        rowPtr = 0
        colPtr = cols - 1

        while( rowPtr < rows and colPtr >= 0):
            if matrix[rowPtr][colPtr] == target:
                return True
            elif matrix[rowPtr][colPtr] > target:
                colPtr -= 1
            else:
                rowPtr += 1
        return False