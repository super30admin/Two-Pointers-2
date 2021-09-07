# Time Complexity : O(logn!)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        height,width = len(matrix),len(matrix[0])
        row,col = height-1,0
        while col< width and row>=0:
            if matrix[row][col] > target:
                row-=1
            elif matrix[row][col] <target:
                col+=1
            elif matrix[row][col] == target:
                return True
        return False
