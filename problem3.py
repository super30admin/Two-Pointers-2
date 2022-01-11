"""
// Time Complexity : O( N+M) M rows N cols
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

"""

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n - 1
        while i < m and j >= 0:
            ele = matrix[i][j]
            if ele == target:
                return True
            elif ele > target:
                j -= 1
            else:
                i += 1
        return False
