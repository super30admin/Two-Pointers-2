
#// Time Complexity : O(m+n)
#// Space Complexity :O(1)
#// Did this code successfully run on Leetcode :yes

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if(matrix==[]):
            return False
        i=0
        j=len(matrix[0])-1
        
        while(i<len(matrix) and j>=0):
            if(target==matrix[i][j]):
                return True
            else:
                if(target<matrix[i][j]):
                    j-=1
                else:
                    i+=1
        return False
