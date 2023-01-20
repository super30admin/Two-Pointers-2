# 240. Search a 2D Matrix II


# using Two pointers
# // Time Complexity : O(mxn)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

 # start from top right or bottom left so we have a binary decision to make
# binary decision -> go towarard increasing number or decreasing number
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
       
        n = len(matrix[0])
        m = len(matrix)
        if len(matrix) == 0: return False
        row = 0
        col = n-1
        # hadnle edge cases
        while(row<m and col >= 0):
            print("in her")
            if matrix[row][col] == target: 
                return True 
            elif matrix[row][col] < target:
                row += 1 # go down toward greater number
            elif matrix[row][col] > target  : #  > target
                col -= 1 # go towards smaller