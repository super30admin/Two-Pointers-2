# Time Complexity : O(N*M)
# Space Complexity : O(1)  
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am using two pointers, row and col. The row pointer starts from the first row, and the col pointer starts from the last column.
# I iterate through the matrix, and at each step, I compare the current element with the target.
# If the current element is equal to the target, I return True.
# If the current element is less than the target, I move the row pointer down to the next row.
# If the current element is greater than the target, I move the col pointer left to the previous column.
# I repeat this process until the row pointer goes out of bounds or the col pointer goes out of bounds.
# If I exit the loop without finding the target, I return False.

from typing import List
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n = len(matrix)
        m = len(matrix[0])
        row = 0
        col = m -1
        while row < n and col >= 0 :
            
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] < target:
                row += 1
            else:
                col -=1
        return False
        