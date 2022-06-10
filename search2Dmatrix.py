#time complexity : O(m+n) i.e. in worst case there is move from the top right corner to all row and then columns
#space complexity : O(1) 
#Did this code successfully run on Leetcode : Yes
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #null case
        if matrix == None or len(matrix) == 0:
            return False
        #considering the checking of the matrix from the top right corner
        #length of row
        m = len(matrix)
        #length of column
        n = len(matrix[0])
        #defining the row and index for starting from top right corner
        i = 0
        j = n-1
        #defining the loop for checking the element till it reaches bottom left corner
        while i<m and j>=0:
            #if the target is search
            if matrix[i][j] == target:
                return True
            #if the target is greater then the current checking matrix element than increase the row
            if matrix[i][j] < target:
                i +=1
            #decrease the column 
            else:
                j -=1
                
        return False
        
        
        
        
