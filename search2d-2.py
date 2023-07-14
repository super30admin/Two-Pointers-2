#TC - O(M+N)
#SC - O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        R = len(matrix)
        C = len(matrix[0])
        r = 0
        c = C-1
        while r<R and c>=0:
            if matrix[r][c] == target:
                return True 
            elif target < matrix[r][c]:
                c-=1
            else:
                r+=1
        return False