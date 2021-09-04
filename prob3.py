# Time Complexity : O(M+N)
# Space Complexity : O(1) as no extra space
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No


class Solution:

    def search2d(self, matrix, target) -> int:

        if matrix is None:
            return False

        m = len(matrix)
        n = len(matrix[0])
        i, j = 0, n-1

        while i < m and j >= 0:

            if matrix[i][j] == target:
                return True
            elif target < matrix[i][j]:
                j -= 1
            else:
                i += 1
        return False

