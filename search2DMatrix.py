# TP Approach
# TC - O(m+n) ==> m+n since we don't visit every element and only a specific nuber of elements in the matrix
# SC - O(1)
# Refer notes

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix is None or len(matrix) == 0: return False

        m = len(matrix)
        n = len(matrix[0])

        # start at 0th row last col
        # row = 0
        # col = n - 1

        # start at last row 1st col
        row = m - 1
        col = 0

        # start at last row 1st col logic
        while row >=0 and col < n:
            if target > matrix[row][col]:
                # move rightward
                col += 1
            elif target < matrix[row][col]:
                # move upward
                row -= 1
            else:
                return True
        return False

        # start at 0th row last col logic
        # # check within bounds
        # while row < m and col >= 0:
        #     if target > matrix[row][col]:
        #         # move leftward
        #         row += 1
        #     elif target < matrix[row][col]:
        #         # move downward
        #         col -= 1
        #     else: # equal to target
        #         return True
        # return False

