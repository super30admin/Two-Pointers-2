"""
TC -> O(rows*cols)
SC -> O(1)
Logic
Use a 2 pointer method. CHoose the top right position. Here r = 0 and c = cols-1.
Perform the following until r<ROWS and c>-1
If the target is lesser than matrix[r][c]->reduce c.
If target is greater than matrix[r][c]->increase r
Return true if target is found else return False
"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ROWS = len(matrix)
        COLS = len(matrix[0])
        r = 0
        c = COLS-1
        while(r<ROWS and c>-1):
            if matrix[r][c]>target:
                c-=1
            elif matrix[r][c]<target:
                r+=1
            elif matrix[r][c]==target:
                return True
        return False