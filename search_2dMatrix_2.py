class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        c = 0
        for i in matrix:
            if target in i:
                c+=1
        return c>0