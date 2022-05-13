#time complexity: O(m+n)
#Space complexity: O(1)
class Solution:
    def searchMatrix(self, matrix, target: int) -> bool:
        m,n=len(matrix),len(matrix[0])
        i,j=0,n-1
        while i<m and j>=0:
            if target == matrix[i][j]:
                return True
            elif target < matrix[i][j]:
                j-=1
            else:
                i+=1
        return False