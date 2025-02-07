# Problem 3 - Search a 2D Matrix II
# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''
In this problem, the elements in the rows and columns are sorted in increasing order, so we begin at either the top-right corner 
or the bottom-left corner. If we start at the top-right corner, we can compare the element with the target and then either move 
down a row or left a column based on the comparison. If the target is found, we return True; otherwise, after making m + n 
comparisons, we return False if the target is not present in the matrix.
'''

# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        # will start from element which is at position of 0th rown and nth column
        i = 0 
        j = n - 1
       # will loop until the we have reached the border
        while (i < m and j >= 0):
            # if the element is equal target it mean we got target
            if matrix[i][j] == target:
                return True
            # if the target is greater than the current element then will increment the row since the element in the rows are sorted
            elif matrix[i][j] < target:
                i += 1
            # else will decrement the column since the element in the column are sorted
            else:
                j -= 1
        return False
        