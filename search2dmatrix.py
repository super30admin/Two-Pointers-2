##Time Complexity : O(m*n)
##Space Complexity :O(1)
##Did this code successfully run on Leetcode : Yes
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        n = len(matrix)
        m = len(matrix[0])
        row = n-1
        col = 0
        while row>=0 and col<m:
            if matrix[row][col] == target:
                return True
            if matrix[row][col] < target:
                col +=1
            else:
                row -=1
        return False