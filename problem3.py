"""
we use boundary condtions and check that if we move left and down as two options, we can reach the answer in o(m+n) time, hence we traverse the array in such
way that we move left and down
TC is o(m+n) and SC is o(1)"""


class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m = len(matrix) #rows
        n = len(matrix[0])
        r, c = 0, n - 1
        while r < m and c >= 0:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                c -= 1
            else:
                r += 1
        return False



