#TC: O(m+n)
#SC: O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i,j=len(matrix)-1,0
        while(i>=0 and j<len(matrix[0])):
            if matrix[i][j]==target:
                return True
            elif target>matrix[i][j]:
                j+=1
            else:
                i-=1
        return False