# Time complexity: O(m+n)
# Space complexity: O(1)
# Works on leetcode: yes
# Approach: Since the matrix is sorted both row and column-wise, we can start comparing the target to top right element.
# If target is less than element we move column to left or if the target is more than element, we move row to down.
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix:
            return False
        m,n = len(matrix),len(matrix[0])
        r,c = 0,n-1
        while r<m and c>=0:
            if target>matrix[r][c]:
                r+=1
            elif target<matrix[r][c]:
                c-=1
            else:
                return True
        return False
        