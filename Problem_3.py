# https://leetcode.com/problems/search-a-2d-matrix-ii/description/

# Time complexity: O(n) 
# Space complexity: O(1)
# Explanation: Start from the bottom left. If the curr value is greater than target, shift up a row. If smaller, then shift right. Finally return target.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m, n = len(matrix), len(matrix[0])
        i, j = m - 1, 0

        while i >=0 and j < n:
            if matrix[i][j] > target:
                i -= 1
            elif matrix[i][j] < target:
                j += 1
            else:
                return True
        
        return False
