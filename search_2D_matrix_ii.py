"""
Two-Pointers-2

Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

Time Complexity : O(m+n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
It is different than search 2D matrix (i) because there next row starting element > prev ending element but here that's not the
case.

For solving this trick is either start from top right or left bottom since there will be a decreasing elements in row & increasing 
in col & vice versa.

For sorted arrays we have binary search & 2 pointer approaches mostly.
Also binary search solution will be O(mlogn) or O(nlogm) so we're preferring two pointer.
"""

# Approach 1 starting from top right 
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or len(matrix) == 0:
            return False

        m = len(matrix)
        n = len(matrix[0])

        row = 0
        col = n-1
        while row < m and col >= 0:
            if matrix[row][col] == target:
                return True
            elif target > matrix[row][col]:
                row += 1
            else:
                col -= 1

        return False
        
        
# Approach 2 starting from bottom left
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or len(matrix) == 0:
            return False

        m = len(matrix)
        n = len(matrix[0])

        row = m-1
        col = 0
        while row >= 0 and col < n:
            if matrix[row][col] == target:
                return True
            elif target > matrix[row][col]:
                col += 1
            else:
                row -= 1

        return False
        