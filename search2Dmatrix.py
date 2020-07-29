# Time Complexity : O(m + n) will be based on number of cols and rows
# Space Complexity : O(1) we are not creating any space
# Did this code successfully run on LeetCode : yes
# Any problem you faced while coding this : No


# since the matrix is sorted in row and col wise, we can start from the top right corner,
# such that going down will lead to higher value and going left, will lead to lower value
# so that we can compare the current value with target and move accordingly

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        if len(matrix) == 0 or len(matrix[0]) == 0: return False

        i, j = 0, len(matrix[0]) - 1

        while i < len(matrix) and j >= 0:

            if matrix[i][j] == target: return True

            if matrix[i][j] > target:
                j -= 1

            elif matrix[i][j] < target:
                i += 1

        return False






