'''
Time Complexity - O(m+n) where m in number of rows and n is number of columns
Space Complexity - O(1)
'''


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) == 0:
            return False
        m = len(matrix)
        n = len(matrix[0])

        row = 0
        col = n-1
        while (row < m and col >= 0):
            if matrix[row][col] == target:
                return True

            elif matrix[row][col] > target:
                col -= 1

            else:
                row += 1

        return False
