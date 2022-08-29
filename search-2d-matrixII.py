# // Time Complexity :O(m+n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :yes
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix)==0:
            return False
        m=len(matrix)
        n=len(matrix[0])
        row=0
        col=n-1
        while col >=0 and row < m:
            if matrix[row][col] < target:
                row += 1
            elif matrix[row][col] > target:
                col -= 1
            else: # found it
                return True

        return False