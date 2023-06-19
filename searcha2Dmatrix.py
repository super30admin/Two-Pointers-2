# // Time Complexity :O(N)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :no
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        r,c=len(matrix),len(matrix[0])
        i,j=0,c-1
        while i<r and j>=0:
            if matrix[i][j] == target:
                return True 
            if matrix[i][j] > target:
                j-=1
            else:
                i+=1
        return False