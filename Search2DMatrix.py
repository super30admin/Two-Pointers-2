from pip import List
#Time Complexity = O(n)
#Space Complexity = O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n-1
        while(i>=0 and i<m and j>=0 and j<n):
            if(target == matrix[i][j]):
                return True
            elif(target<matrix[i][j]):
                j-=1
            else:
                i+=1
        return False
