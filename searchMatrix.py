# Leetcode 240. Search a 2D Matrix II

# Time Complexity :  O(m+n) where m,n is the size of the matrix

# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: While searching through the matrix if the target is lesser than the right boundary, reduce
# the value of right boundary to decrease the number of elements to be searched. Since the elements are
# sorted if the target is not greater than current boundary, there is no need for searching beyond it.

# Your code here along with comments explaining your approach

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """

        if len(matrix) == 0 or len(matrix[0]) == 0:
            return False

        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n-1

        while i < m and j >= 0:
            if matrix[i][j] == target:
                return True
            elif target < matrix[i][j]:
                j -= 1
            else:
                i += 1
        return False
