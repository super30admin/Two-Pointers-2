#TIme Complexityy :O(m*n)
# Space COmplexity : O(1)
# Able to run on leetcode :Yes
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m= len(matrix)
        n=len(matrix[0])
        i=m-1
        j=0
        while j<n and i>=0:
            if matrix[i][j]== target:
                return True
            elif matrix[i][j]<target:
                j+=1
            else:
                i-=1
        return False
        