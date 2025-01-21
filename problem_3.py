#  Problem: https://leetcode.com/problems/search-a-2d-matrix-ii/description/
#  Time complexity: O(n+m)
#  Space complexity: O(1)

# Approach:
# I am using two pointers row and col. I am starting from the top right corner of the matrix.
# I am comparing the element at the current position with the target.
# If the element is equal to the target, I am returning True.
# If the element is less than the target, I am incrementing the row.
# If the element is greater than the target, I am decrementing the column.
# If the element is not found, I am returning False.


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        row = 0
        col = n -1
        while row < m and col >= 0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] < target:
                row += 1
            else:
                col -= 1
        
        return False