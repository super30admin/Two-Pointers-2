# https://leetcode.com/problems/search-a-2d-matrix-ii/

# TC: O(m + n)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix) #5
        n = len(matrix[0]) #5

        r = m - 1
        c = 0

        while 0 <= r < m and 0 <= c < n:
            if matrix[r][c] < target:
                c += 1
            elif matrix[r][c] > target:
                r -= 1
            elif matrix[r][c] == target:
                return True
        
        return False
    