# Start from the top-right corner and eliminate rows or columns
# If target > current element → Move down (eliminate row)
# If target < current element → Move left (eliminate column)
# If target == current element → Return True

# TC: O(m + n) At most (m + n) steps in the worst case
# SC: O(1) Constant space used
from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        if not matrix or not matrix[0]:
            return False

        m, n = len(matrix), len(matrix[0])  # Matrix dimensions
        r, c = 0, n - 1  # Start at top-right corner

        while r < m and c >= 0:
            if target > matrix[r][c]:
                r += 1  # Move down
            elif target < matrix[r][c]:
                c -= 1  # Move left
            else:
                return True  # Target found

        return False  # Target not found


# Example usage
matrix = [[1, 4, 7, 11], [2, 5, 8, 12], [3, 6, 9, 16], [10, 13, 14, 17]]
target = 5

sol = Solution()
print(sol.searchMatrix(matrix, target))  # Output: True
