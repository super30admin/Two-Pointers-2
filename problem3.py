#time-O(m+n)
#space-O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m=len(matrix)
        n=len(matrix[0])
        i=m-1
        j=0
        while i>=0 and j<=n-1:
            if target==matrix[i][j]:
                return True
            elif target<matrix[i][j]:
                i=i-1
            else:
                j=j+1
        return False
