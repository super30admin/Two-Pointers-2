#Time Complexity : mlog(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m, n = len(matrix), len(matrix[0])
        row, col = 0, n-1
        
        while row != m and col >= 0:
            if target == matrix[row][col]:
                return True
            if target > matrix[row][col]:
                row = row+1
            else:
                col = col-1
        
        return False