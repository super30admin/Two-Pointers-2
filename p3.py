## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
# TC : O(n)
# SC : O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i, j = 0, (len(matrix[0]) - 1)
        while i < len(matrix) and i >=0 and j <len(matrix[0]) and j >= 0:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                j -= 1
            else:
                i += 1
        return False
                