# Time Complexity: O(m+n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Start either from the top right corner or bottom left corner to have one decision at each at every point
# Compare the current position with target, either it is smaller or larger
# If it is larger, decrement column
# If it is smaller, increment row
# Traverse and keep comparing the current position with the target
# If target is not found, return false at the end
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix == None or len(matrix) == 0:
            print(False)

        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n - 1
        
        while (i>=0 and i < m and j >= 0 and j<n):
            if matrix[i][j] == target:
                return True
            # Compare the current position with target, if it is larger, decrement the column to go to the lesser value
            elif (matrix[i][j] > target):
                j = j - 1
            # Compare the current position with target, if it is smaller, increment the row to go to bigger value
            else:
                i = i + 1
        # target is not found, return false
        return False
                
                
            