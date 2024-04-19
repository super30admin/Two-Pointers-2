# Two-Pointers-2
## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

# Approach
# m = no of row, n = no. of columns. set r = 0 and c = n-1 which is last element of the first 1. 
# while(r < m and c >=0), if value == target, return true. If value at that index < target, increment row else decrement col. 
# If index goes out of range, return False

# Time Complexity: O(m+n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        r = 0
        c = n-1

        while(r < m and c >=0):
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] < target:
                r += 1
            else:
                c -= 1
        return False