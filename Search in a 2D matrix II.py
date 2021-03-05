# Time Complexity: O(m+n)
# Space Complexity: O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        if m==0 and n==0:
            return False
        r = m - 1
        c = 0
        while(r>=0 and c <n):
            if target > matrix[r][c]:
                c += 1
            elif target < matrix[r][c]:
                r -= 1
            else:
                return True
