# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
 
# Your code here along with comments explaining your approach

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        return self.search(len(matrix)-1,0,matrix,target)
            
    def search(self, row,col,matrix,target:int)->bool:
        while row >=0 and col <= len(matrix[0])-1:
            if target == matrix[row][col]:
                return True
            elif target < matrix[row][col]:
                row = row-1
            else:
                col = col + 1
        return False