
# Two Pointer Solution

# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        if matrix == None or len(matrix) == 0:
            None
            
        m = len(matrix)
        n = len(matrix[0])
        
        row = 0
        col = n-1
        
        while row < m and col >= 0:
            currElement = matrix[row][col]
            if currElement == target:
                return True
            elif currElement > target:
                col -= 1
            else:
                row += 1
                
        return False
                
                