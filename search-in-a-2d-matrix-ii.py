# Time Complexity : O(m + n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
Start from top right corner
And if target > element, go down
else, go left
"""


class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """

        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n-1

        while i < m and j >= 0:
            if matrix[i][j] == target:
                return True
            elif target > matrix[i][j]:
                i = i + 1
            else:
                j = j-1
        return False