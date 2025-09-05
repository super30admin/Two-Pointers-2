"""
TC: O(m + n) {at worst case we can iterate the entire row and then the entire col to search the element}
SC :O(1) {no extra space is used}

Approach:

Since we know the rows and sorted and the cols are also sorted. We can start our search from either top right or bottom left corner
of the matrix. This is because only at these two points, both of the directions (top/bottom and left/right) correspond to some
sorted pattern, ie decreasing or increasing.

We take this into account and begin our search, if the curr element at that i,j is bigger, we move to the point where the array goes 
descending and likewise for the curr element smaller we move to the direction which is ascending.
Eventually if there is the target in the matrix, we will catch it if the curr == target (return True) else we will run out of bounds and terminate the loop.

Eventually return False.

The problem ran successfully on Leetcode.
"""
from typing import List
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n,m = len(matrix), len(matrix[0])

        i,j = 0, m-1

        while j>=0 and i < n:
            curr = matrix[i][j]
            if curr == target:
                return True
            
            if curr > target:
                j -= 1
            else:
                i += 1
        
        return False