# O(n+m) time, O(1) space
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        i=0 # rows
        j = n-1 # cols

        while i < m and j >= 0:
            if matrix[i][j]==target:
                return True 
            elif matrix[i][j]<target:
                i+=1
            else:
                j-=1

        return False 