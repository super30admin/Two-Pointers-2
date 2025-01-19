# Two pointers. Start from any corner of the matrix and use the sorted array logic to increment or decrement accordingly
# TC: O(m + n)
# SC: O(1)
# Yes, this worked in leetcode

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) == 0:
            return False
        m = len(matrix)
        n = len(matrix[0])
        row = 0
        col = n - 1
        while row < m and col >= 0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] < target:
                row += 1
            else:
                col -= 1
        return False
