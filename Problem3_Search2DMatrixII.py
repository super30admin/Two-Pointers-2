# Time Complexity : O(m + n) where m is rows and n is columns
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Start from top-right corner (or bottom-left) and use two pointers to traverse.
# If current element is greater than target, move left (eliminate column); if smaller, move down (eliminate row).
# This leverages the sorted property of both rows and columns to efficiently narrow down the search space.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or not matrix[0]:
            return False
        
        m, n = len(matrix), len(matrix[0])
        # Start from top-right corner
        row = 0
        col = n - 1
        
        while row < m and col >= 0:
            current = matrix[row][col]
            
            if current == target:
                return True
            elif current > target:
                # Current element is too large, eliminate this column
                col -= 1
            else:
                # Current element is too small, eliminate this row
                row += 1
        
        return False
