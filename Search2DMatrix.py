"""
Time Complexity : O(m + n)
Space Complexity : O(1)
Did this code successfully run on Leetcode :
Three line explanation of solution in plain english
"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return False
        m = len(matrix)
        n = len(matrix[0])
        row = m - 1
        col = 0
        # We do decrement the row when we see num > target
        # and increment the column when we see a num < target
        while row >= 0 and col < n:
            if target == matrix[row][col]:
                return True
            else:
                if target < matrix[row][col]:
                    row -= 1
                else:
                    col += 1
        return False