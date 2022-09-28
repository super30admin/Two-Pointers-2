# TC: O(m+n)
# SC: O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        start = matrix[0][n-1]
        
        r = 0
        c = n - 1
        while r<m and c >= 0:
            if target > matrix[r][c]:
                r += 1
            elif target < matrix[r][c]:
                c -= 1
            else:
                return True
        return False
        
