#Time Complexity: O(M+N)
#Space Complexity: O(1)

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix or not matrix[0]:
            return False

        rows = len(matrix)
        cols = len(matrix[0])

        row = 0
        col = cols - 1  # Start at top-right corner

        while row < rows and col >= 0:
            current = matrix[row][col]

            if current == target:
                return True
            elif current > target:
                col -= 1  # Move left
            else:
                row += 1  # Move down

        return False
            