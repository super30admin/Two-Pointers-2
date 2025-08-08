# Uses a two-pointer walk from top-right, discarding one row or column per step based on comparison with target
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m,n = len(matrix), len(matrix[0])
        r,c = 0, n-1
        while r<m and c>=0:
            if matrix[r][c]==target:
                return True
            elif matrix[r][c]>target:
                c-=1
            else:
                r+=1
        return False