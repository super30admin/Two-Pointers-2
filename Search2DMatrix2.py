# Time Complexity : O(m+n)
# Space Complexity : O(1)
class Solution:
    def searchMatrix(self, matrix, target):
        if not matrix or len(matrix) == 0:
            return False
        
        m, n = len(matrix), len(matrix[0])
        i, j = 0, n - 1  # Start at the top-right corner
        
        while i < m and j >= 0:
            if target == matrix[i][j]:
                return True
            elif target > matrix[i][j]:  # Target greater -> Go down
                i += 1
            else:  # Target smaller -> Go left
                j -= 1
        
        return False

# Examples

# Example 1
matrix = [
    [1, 4, 7, 11, 15],
    [2, 5, 8, 12, 19],
    [3, 6, 9, 16, 22],
    [10, 13, 14, 17, 24],
    [18, 21, 23, 26, 30]
]
target1 = 5

# Example 2
target2 = 20

# Example 3
target3 = 19

solution = Solution()

print(solution.searchMatrix(matrix, target1))  # Output: True
print(solution.searchMatrix(matrix, target2))  # Output: False
print(solution.searchMatrix(matrix, target3))  # Output: True