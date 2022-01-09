
# Time Complexity : O(m+n)
#Space Complexity:o(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :No
# Your code here along with comments explaining your approach
# Searching the matrix from the top corner onwards
# if the target is less than the matrix element move left and eliminate the column
# if the target is greater than the matrix element move down and eliminate the row



class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
          
        m = len(matrix)-1
        n = len(matrix[0])-1
        
        i = 0 
        while(i <= m and  n >=0):
            
            ele = matrix[i][n]
            
            if ele == target:
                return True
            elif target < ele:
                n-=1
            else:
                i +=1
        
        return False
                
   
            
                            
             