// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix==None or len(matrix)==0 or len(matrix[0])==0:
            return False
        
        n=len(matrix)
        m=len(matrix[0])
        i=0
        j=m-1
        
        while i<n and j>=0:                
            if matrix[i][j]==target:                //check if the element at current index is == target =>return True
                return True
            elif matrix[i][j]<target:                 //if the current element is < target  => move left 
                i+=1
            else:
                j-=1                                 //if the current element is > target => move down
        return False
    

