# Time Complexity : It is O(log m+n) since we are moving only either row or col.
# Space Complexity : There is no extra space so it O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : It was failing when the row has only one row with more columns.

from typing import List
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        row = len(matrix)-1
        col = 0
        
        while row!=-1 and col != len(matrix[0]):
            if target == matrix[row][col]:
                return True
                
            if target < matrix[row][col] :
                row=row-1
            elif target > matrix[row][col]:
                col=col+1
               
        return False 
        
       

obj = Solution()
print(obj.searchMatrix([[-1,3]],3))
#print(obj.searchMatrix([[1,1]],0))
#print(obj.searchMatrix([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]],20))