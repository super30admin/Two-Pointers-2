"""
Time Complexity : O(m+n) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
As the rows and columns are in sorted order, we have an advantage in searching. The advantage being, the top right
corner and bottom left corner are good starting points for search. This is because, at both of these points,
we have an option of going in either direction based on the number we are searching. For eg, if we are at top right
corner, and we have a target lesser than that, we know that it would be left of it and vice versa. This
does not apply for top left and bottom right corners as in top left, both directions have increasing numbers
and in bottom right, both directions have decreasing numbers. Sorted rows and columns gives us this advantage 
and we proceed in this fashion.
"""


class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix:
            return False
        m = len(matrix)-1
        n = len(matrix[0])-1
        i = 0
        j = n
        while i <= m and j >= 0:
            value = matrix[i][j]
            if value == target:
                return True
            elif target > value:
                i += 1
            elif target < value:
                j -= 1
        return False
