# Time Complexity: O(m+n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No


class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m = len(matrix)
        n = len(matrix[0])
        r = 0
        c = n - 1

        while r<=m-1 and c>=0:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                c-=1
            else:
                r+=1

        return False            