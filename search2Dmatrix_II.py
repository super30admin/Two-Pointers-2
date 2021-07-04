"""
Time Complexity : O(m+n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : none
"""

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m = len(matrix)
        if matrix == None or m == 0:
            return False
        
        n = len(matrix[0])
        i = 0
        j = n - 1
        
        while i < m and j >= 0:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target:
                i += 1
            else:
                j -= 1
                
        return False
                
s = Solution()
print(s.searchMatrix([[1,4,7,11,15],
                      [2,5,8,12,19],
                      [3,6,9,16,22],
                      [10,13,14,17,24],
                      [18,21,23,26,30]], 13))
print(s.searchMatrix([[1,4,7,11,15],
                      [2,5,8,12,19],
                      [3,6,9,16,22],
                      [10,13,14,17,24],
                      [18,21,23,26,30]], 35))