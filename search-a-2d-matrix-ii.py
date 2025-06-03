## Problem3: search-a-2d-matrix-ii

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
    # we start at [1][n], and compare value with target. 
    # if target is smaller, move pointer to previous column
    # if target is greater, move pointer to next row
    # if value = target, return [][]
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        row, column = 0, len(matrix[0]) - 1

        while row < len(matrix) and column >=0:
            if matrix[row][column] == target:
                return True
            if matrix[row][column] > target:
                column -= 1
            if matrix[row][column] < target:
                row += 1

        return False