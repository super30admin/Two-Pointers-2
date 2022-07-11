"""
TC:O(m+n)
SC:O(1)
"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row=0
        col=len(matrix[0])-1
        while -1<row<len(matrix) and -1<col<len(matrix[0]):
            if target==matrix[row][col]:
                return True
            if target > matrix[row][col]:
                row+=1
            else:
                col-=1
        return False