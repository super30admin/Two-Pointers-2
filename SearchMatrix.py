# Time Complexity - O(m*n)

# Space Complexity - O(1)

# Did this code successfully run on Leetcode : Yes

# Any problem you faced while coding this : No

# Approach
# I use a two pointer approach which are set to the topmost rightmost element(i=0,j=n-1)
# If I encounter element less than target I increment i else decrement j.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if target == None or len(matrix) == 0:
            return None

        i, j = 0, len(matrix[0]) - 1

        while (i < len(matrix) and j >= 0):
            if matrix[i][j] == target:
                return True

            elif matrix[i][j] > target:
                j -= 1

            else:
                i += 1

        return False

