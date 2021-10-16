class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #TC O(m + n)
        # SC O(1)
        if matrix is None or len(matrix) == 0:
            return False
        m = len(matrix)
        n = len(matrix[0])
        i = m - 1
        j = 0
        while (i >=0 and j < n):
            if (matrix[i][j] == target):
                return True
            elif (matrix[i][j]< target):
                j += 1
            else:
                i -= 1
        return False
