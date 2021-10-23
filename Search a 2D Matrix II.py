# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(m+n)
# Space Complexity: O(1)
# Logic: Start from bottom left or top right. if from bottom left, compare the target with the pointer value, if pointer
# value is greater that means it can't lie in that row, decrease row. If pointer value less than target that means
# target can lie in same row so increase column.

class Solution:
    def searchMatrix(self, matrix, target: int):
        i = len(matrix) - 1
        j = 0
        while i >= 0 and j < len(matrix[0]):
            if matrix[i][j] > target:
                i -= 1
            elif matrix[i][j] < target:
                j += 1
            else:
                return True
        return False
