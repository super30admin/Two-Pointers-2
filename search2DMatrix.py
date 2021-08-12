"""
//Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        # for row in range(len(matrix)):
        #     for col in range(len(matrix[0])):
        #         if matrix[row][col]==target:
        #             return True
        # return False
        m = len(matrix)
        n = len(matrix[0])
        i = m -1 
        j = 0
        while(j<n and i>=0):
            if target<matrix[i][j]:
                i-=1
            elif target>matrix[i][j]:
                j+=1
            else:
                return True
        return False
            