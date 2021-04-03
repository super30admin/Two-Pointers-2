# Time Complexity : O(m + n), where m is the number of rows and n is the number of columns
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = len(matrix) - 1
        col = 0

        while (row >= 0 and col <= len(matrix[0]) - 1):

            if matrix[row][col] == target:
                return True

            elif matrix[row][col] > target:
                row -= 1

            else:
                col += 1

        return False
