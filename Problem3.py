# 240. Search a 2D Matrix II

# Time Complexity: O(n+m)
# Space Complexity: O(1)

# Approach:
# Use two pointers to search the matrix.
# Start from the top right corner of the matrix.
# If the current element is greater than the target, move the pointer left.
# If the current element is less than the target, move the pointer down.
# If the current element is equal to the target, return True.
# If the pointer moves out of bounds, return False.


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix)
        cols = len(matrix[0])
        row = 0
        col = cols - 1

        while row < rows and col >= 0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] > target:
                col -= 1
            else:
                row += 1

        return False    
    
    