class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix == [] or len(matrix) == 0:
            return False
        m = len(matrix)
        n = len(matrix[0])
        i = m - 1
        j = 0
        while i >= 0 and j <= n - 1:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target:
                j += 1
            else:
                i -= 1

        return False
        # time-O(n+m) space-O(1)