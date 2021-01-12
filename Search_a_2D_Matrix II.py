# Time Complexity : O(n + m)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Search Space Reduction Approach
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #Base case
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return False
        
        height = len(matrix)
        width = len(matrix[0])
        
        # starts from top - right position (we can perform top- right or buttom left to perform given task we cannot chose other since we miss the direction)
        row = 0
        col = width - 1
        
        # Boundary condition
        while row < height and col >= 0:
            # found target return true
            if matrix[row][col] == target:
                return True
            # check value with target if > then col -= 1 else row += 1
            if matrix[row][col] > target:
                col -= 1
            else:
                row += 1
                
        return False
