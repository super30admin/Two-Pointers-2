"""
Problem: Search a 2D Matrix II
Approach: we can choose to lower the search space by either rejecting the row or the column based on the target. Two options -
start from either top right corner of the matrix or bottom left
t.c. => O(m + n)
s.c. => O(1)
"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m, n = len(matrix), len(matrix[0])
        row, col = m - 1, 0
        while row >=0 and col < n:
            if matrix[row][col] == target:
                return True
            
            if target > matrix[row][col]:
                col += 1
            else:
                row -= 1
        return False
        