#We are taking only one pointer here therefore, TC:O(m+n) sc:O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix:
            return False
            
        m=len(matrix)
        n=len(matrix[0])
        row=0
        col=n-1
        p = matrix[0][col]

        while row<m and col>=0:
            if matrix[row][col] == target:
                return True
            elif matrix[row][col]<target:
                row+=1
            else:
                col-=1
            
        return False
