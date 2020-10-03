"""
Problem: 240. Search a 2D Matrix II
Solution: Keep pointer at top right corner or bottom left corner,
    - if the target is less than pointer, move pointer to left
    - if the target is more than pointer, move pointer to bottom
    - if target is equal to pointer, return true
Time Complexity: O(m+n), m rows and n columns
Space Complexity: O(1)
"""


class Solution:
    def searchMatrix(self, matrix, target):
        # Base Case
        if matrix is None or len(matrix) == 0:
            return False

        # Start our pointer at the top right
        left = 0
        right = len(matrix[0]) - 1

        while left < len(matrix) and right >= 0:
            # move column to left
            if target < matrix[left][right]:
                right -= 1
            # move row to below
            elif target > matrix[left][right]:
                left += 1
            else:  # found the number
                return True
        return False


obj = Solution()
matrix = [
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
print(obj.searchMatrix(matrix, 18))
print(obj.searchMatrix(matrix, 31))