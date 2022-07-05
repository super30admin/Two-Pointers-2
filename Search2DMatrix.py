#240. Search a 2D Matrix II
"""
Time Complexity : O(m+n)
Space Complexity : O(1)
"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        no_of_rows, no_of_columns = len(matrix), len(matrix) and len(matrix[0])
        r, c = 0, no_of_columns-1
        while r < no_of_rows and c >= 0:
            if target > matrix[r][c]:
                r += 1
            elif target < matrix[r][c]:
                c -= 1
            else: return True
        return False 
