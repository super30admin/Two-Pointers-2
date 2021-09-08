// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix)==0 and len(matrix[0])==0:
            return False
        m=len(matrix)
        n=len(matrix[0])
        i=0
        j=n-1
        while(i<m and j>=0):
            if(matrix[i][j]==target):
                return True
            elif matrix[i][j]>target:
                j-=1
            else:
                i+=1
        return False
