class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        m=0
        n=len(matrix[0])-1

        while m<len(matrix) and n>=0:
            if matrix[m][n]==target:
                return True
            elif target<matrix[m][n]:
                n=n-1
            else:
                m=m+1
        return False