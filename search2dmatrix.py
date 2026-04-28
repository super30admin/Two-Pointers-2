# // Time Complexity : O(m+n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m=len(matrix)
        n=len(matrix[0])

        diag =  max(m,n)
        row=0
        col=n-1
        while 0<=row<m and 0<=col<n:
            if target<matrix[row][col]:
                col-=1
            elif target>matrix[row][col]:
                row+=1
            else:
                return True

        return False


            