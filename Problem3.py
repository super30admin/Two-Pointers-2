#Time Complexity : O(m+n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : YES
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = len(matrix)
        col = len(matrix[0])
        
        j = col - 1
        i = 0
 
        while j >=0 and i < row:
            if matrix[i][j] > target:
                j -=1
            elif matrix[i][j] < target:
                i +=1
            elif matrix[i][j] == target:
                return True
            
        return False