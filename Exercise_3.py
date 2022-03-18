    # 240. Search a 2D Matrix II
    # Time Complexity : O(n)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : Yes
    # Any problem you faced while coding this : No


class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m = len(matrix)
        n = len(matrix[0])
        row = m-1
        col = 0
        
        while(row<m and col<n and row>=0 and col>=0):
            if matrix[row][col]> target:
                row -=1
            elif matrix[row][col] < target:
                col +=1
            else:
                return True