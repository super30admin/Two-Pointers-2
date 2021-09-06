# time complexity: O(N+M)
# space complexity: O(1)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or len(matrix[0]) == 0:
            return False
        
        cols = len(matrix[0])
        rows = len(matrix)
        row = rows - 1
        col = 0
        while row >= 0 and col < cols:
            if matrix[row][col] == target:
                return True
            if matrix[row][col] > target:
                row  = row - 1
            else:
                col = col + 1
        
        return False