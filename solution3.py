# https://leetcode.com/problems/search-a-2d-matrix-ii/
# // Time Complexity : O(n+m)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : edge case when len(matrix) == 0
#
#
# // Your code here along with comments explaining your approach


class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if len(matrix) == 0:
            return False

        m = len(matrix)
        n = len(matrix[0])
        pointm = 0
        pointn = n - 1

        while pointn >= 0 and pointm < m:
            if matrix[pointm][pointn] > target:
                pointn -= 1

            elif matrix[pointm][pointn] < target:
                pointm += 1

            elif matrix[pointm][pointn] == target:
                return True

        return False

