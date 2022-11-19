# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode: Yes
# Three line explanation of solution in plain english

# Here we start at the top right corner of the matrix(can also be done with the bottom left corner)
# if the element we are looking for is greater than the curr then we go down
# (since it is sorted from left to right and top to bottom)
# or if the element is less than the curr then we move left
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix) - 1
        cols = len(matrix[0]) - 1
        curr_row = 0
        curr_col = cols

        while((curr_row<=rows) and (curr_col>=0)):
            if matrix[curr_row][curr_col] == target:
                return True
            elif target > matrix[curr_row][curr_col]:
                curr_row += 1
            else:
                curr_col -= 1
        return False
