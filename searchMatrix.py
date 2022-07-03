# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# This is similar to a linear search from the end of the array
# Since we know that the arrays are sorted, we can get to the first item smaller than target
# And the search that array
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n - 1

        while i < m and j >= 0:
            # print("i: ", i, " j: ", j, " val: ", matrix[i][j])
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target:
                i += 1
            else:
                j -= 1
        return False
