
## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

# // Time Complexity : o(m+n), where m is the number of rows, n is the number of columns.
# // Space Complexity : o(1)

class Solution:
    def searchMatrix(self, matrix, target):
        rows, cols = len(matrix), len(matrix[0])
        bottom = cols-1
        left = 0
        
        while bottom >= 0 and left <= rows-1:
            if matrix[left][bottom] == target:
                return True
            if matrix[left][bottom] > target:
                bottom -= 1
            elif matrix[left][bottom] < target:
                left += 1
        return False