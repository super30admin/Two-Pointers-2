// Time Complexity :O(n+m)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
class Solution:
    def searchMatrix(self, matrix, target):
        if(matrix == None or len(matrix)==0):
            return False
        i=0
        j=len(matrix[0])-1
        while(i<len(matrix) and j>=0):
            if(matrix[i][j]==target):
                return True
            elif matrix[i][j]<target:
                i+=1
            elif matrix[i][j]>target:
                j-=1
        return False
                
                
