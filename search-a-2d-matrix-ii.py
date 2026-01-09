''' Time Complexity : O(m+n) 
    Space Complexity : O(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No


   Approach : Start from Top-Right corner, if target is less then go to left, else go to downwards
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows,cols = len(matrix), len(matrix[0])
        r, c = 0, cols-1
        while 0<=r<rows and 0<=c<cols:
            if target == matrix[r][c]:
                return True
            elif target < matrix[r][c]:
                c -= 1
            else:
                r += 1
        return False