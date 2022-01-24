#Time Complexity = O(n)
#Space Complexity = O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        j = 0
        i= m-1
        while(i>=0 and j<n):
            if(matrix[i][j]==target):
                return True
            elif(matrix[i][j]>target):
                i-=1
            else:
                j+=1
        return False
        
        