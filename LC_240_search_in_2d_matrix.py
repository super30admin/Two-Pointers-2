# o(m+n)->TC
# O(1)->SC
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        # #solution for top right corner matrix[0][4] = 5
        # m = len(matrix)
        # n = len(matrix[0])
        # row = 0 #
        # col = n-1

        # while row <= m-1 and col >= 0:
        #     if matrix[row][col] == target:
        #         return True
        #     elif matrix[row][col] > target:
        #         col = col - 1
        #     else:
        #         row = row + 1
        # return False

        #solution for bottom left corner matrix[4][0]
        m = len(matrix)
        n = len(matrix[0])
        row = m-1
        col = 0

        while(row>=0 and col<=n-1):
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] > target:
                row = row -1
            else:
                col = col + 1
        return False
