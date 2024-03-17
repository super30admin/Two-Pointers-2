# TC = O(mn) where m is number of rows and n is number of columns in matrix
# SC = O(1)


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i, j = 0, len(matrix[0]) - 1
        print(i, j)
        while i < len(matrix) and j >= 0:

            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target:
                i += 1
            else:
                j -= 1

        return False
