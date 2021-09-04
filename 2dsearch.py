# // Time Complexity :O(m+n),m is the row n is the column
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach




class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        i=0
        j=len(matrix[0])-1
        while(i<len(matrix) and j>=0):
                
                if matrix[i][j]==target:
                    return True
                    
                if matrix[i][j]>target:
                    j=j-1
                else:
                    i=i+1
        return False