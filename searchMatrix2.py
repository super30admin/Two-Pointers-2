# Time Complexity : O(m+n), where m is the number of rows and n is the number of columns
# Space Complexity : O(1)


class Solution:
    def searchMatrix(self, matrix, target):

        if len(matrix) == 0:
            return False

        m = len(matrix)
        n = len(matrix[0])

        # Start from top-right corner i.e., 1st Row and Last Column
        r = 0
        c = n - 1
        while r < m and c >= 0:

            # If matrix[r][c] is less than the target, move downwards
            if matrix[r][c] < target:
                r = r + 1
            # If matrix[r][c] is greater than the target, move towards left
            elif matrix[r][c] > target:
                c = c - 1
            # This means we have found the target
            else:
                return True

        return False
