# // Time Complexity : O(m + n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        rows = len(matrix)
        if rows == 0:
            return False
        cols = len(matrix[0])

        #     starting point

        row = rows - 1
        col = 0

        while (row >= 0 and row < rows) and (col >= 0 and col < cols):
            element = matrix[row][col]

            if target == element:
                return True
            elif target > element:
                col = col + 1
            else:
                row = row - 1
        return False
