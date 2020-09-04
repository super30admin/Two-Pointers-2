# 240. Search a 2D Matrix II

# code: Approach in Comments

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        # Base Condition:
        if not matrix:
            return False
        
        # Initializing variables
        m, n = len(matrix), len(matrix[0])
        r, c = 0, n-1
        
        # Check if target is in the first row last col, If M[r][c]<target, we can safely say target is not in this row and increment the row.
        # Check if target < M[r][c], we know that the target is in this row in some col. so we decrement the col.
        while r < m and c >= 0:
            if target > matrix[r][c]:
                r += 1
            elif target < matrix[r][c]:
                c -= 1
            else: 
                return True
        return False

# Time Complexity :  O(m+n) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES.