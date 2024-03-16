# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        i=0
        j=n-1
        while i<m and j>=0:
            if target==matrix[i][j]:
                return True
            elif target<matrix[i][j]: #Traverse towards left of element
                j-=1
            else:
                i+=1        #Traverse downwards since greater element would be towards bottom
        return False   
        