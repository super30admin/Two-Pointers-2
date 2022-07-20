#TC => o(m+n)
#SC => o(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or len(matrix) == 0:
            return False
        #bottom left approach
        r = len(matrix)-1
        c = 0
        
        while r>=0 and c<=len(matrix[0])-1:
            if target > matrix[r][c]:
                c+=1
            elif target < matrix[r][c]:
                r-=1
            else:
                return True
        return False