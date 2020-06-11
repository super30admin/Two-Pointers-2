# June 11, 2020
# Try different approaches ( think if heaps can work)

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """

        # Time complexity : O(m^n)
        # Pass through the entire matrix

        # Space compexity : O(1)
        # No extra space needed, just traverse and compare

        # Method 1: Brute force
        '''
        - Searching through the entire matrix

        '''
        # does not work in leetcode

        row = len(matrix)
        col = len(matrix[0])

        for i in range(row):
            for j in range(col):
                if matrix[row][col] == target:
                    return True

        return False
