# Time Complexity : O(M*N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :

# Your code here along with comments explaining your approach
# Using two pointers for row and column i and j.
# Check if the target > last element of ifrst row then increment i by 1 else decrement j by 1


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) == 0:
            return False

        i = 0
        j = len(matrix[0]) - 1

        while i <= len(matrix) - 1 and j >= 0:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target:
                i += 1
            else:
                j -= 1

        return False