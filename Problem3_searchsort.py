'''
Our approach here is to start from the top corner or bottom coner and do the search only move in a direction that is closer to our element and remove rows and columns from the search while doin that
'''
'''
Time Complexity: O(m+n)
Space Complexity : O(1)
'''


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        # null
        if (matrix == None or len(matrix) == 0):
            return False
        m = len(matrix)
        n = len(matrix[0])

        i = 0
        j = n - 1
        while (i < m and j >= 0):
            if (matrix[i][j] == target):
                return True
            if (matrix[i][j] < target):
                i += 1
            else:
                j -= 1
        return False
