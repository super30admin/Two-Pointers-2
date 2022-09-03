"""
Time Complexity : O(m*n)
Space Complexity : O(1) No new data structure is used
Did this code successfully run on Leetcode :
Three line explanation of solution in plain english:
Iterate through the elements and return the target if found

// Your code here along with comments explaining your approach
"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix)
        cols = len(matrix[0])
        
        for row in range(rows):
            for col in range(cols):
                if matrix[row][col] == target:
                    return True
        return False