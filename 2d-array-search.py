# // Time Complexity : O(m+n) - dimentions of matrix
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# Basic idea is to reduce the search space with subsequent comparisons
# Start at the top left corner of the matrix, if the target is < element, move the search in-wards (col - 1)
# if the target is > element, move the search down-wards (row + 1)

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if len(matrix) == 0: return False
        i = 0
        j = len(matrix[0]) - 1
        while i < len(matrix) and j >= 0:
            if target == matrix[i][j]:
                return True
            elif target < matrix[i][j]:
                j -= 1
            else:
                i += 1
        return False