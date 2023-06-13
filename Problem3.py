class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        Time complexity: O(m + n)
        Space complexity: O(1)
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix is None or len(matrix) == 0:
            return False

        m = len(matrix)  # Number of rows in the matrix
        n = len(matrix[0])  # Number of columns in the matrix

        i = 0  # Start from the top-right corner of the matrix
        j = n - 1

        while i < m and j >= 0:
            if matrix[i][j] == target:  # If the current element is equal to the target, return True
                return True
            else:
                # If the current element is smaller than the target, move down
                if matrix[i][j] < target:
                    i += 1
                else:  # If the current element is larger than the target, move left
                    j -= 1

        return False  # If the target is not found, return False
