# Time Complexity: O(M + N), M is the number of rows and N is the number of columns
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes



from typing import List

class Solution:

    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        row = 0
        col = n - 1

        while row < m and col >= 0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] > target:
                col -= 1
            else:
                row += 1
        
        return False

        