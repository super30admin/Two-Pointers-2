#Time Complexity : O(n+m)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :Yes
#Any problem you faced while coding this :No

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix==None:
            return True
        m = len(matrix) #number of rows
        n = len(matrix[0]) # number of cols
        
        currentRow =0
        currentCol = n-1
        
        while(currentCol>=0 and currentRow< m):
            if matrix[currentRow][currentCol] == target:
                return True
            elif matrix[currentRow][currentCol] >target:
                currentCol-=1
            else:
                currentRow +=1
        return False
                
