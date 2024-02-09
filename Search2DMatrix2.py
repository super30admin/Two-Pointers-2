# Time complexity is O(m+n) m is length of rows and n is length of columns
# Space complexity is O(1) no extra space used

class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:

        # As it is a sorted matrix row wise and column wise
        # I just need run pointer either from right up corner or left down corner to the availabilty of target
        # Only these tow positions have one side large and other side small neighbour
        # Column length
        n = len(matrix[0])

        # rows index
        i = len(matrix) - 1

        # column index
        j = 0

        while (i >= 0 and j < n):
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target:
                j += 1
            else:
                i -= 1
        return False
