# Time Complexity :O(mn)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
# Start from the top-right corner and compare the target with the current element.
# If the target is smaller, move left; if larger, move down.
# This eliminates one row or one column at each step, ensuring efficient search.
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i = 0
        j = len(matrix[0])-1
        while i <len(matrix) and j>=0:
            if target == matrix[i][j]:
                return True
            elif target < matrix[i][j]:
                j -= 1
            else:
                i += 1
        return False