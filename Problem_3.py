#
# @lc app=leetcode id=240 lang=python3
#
# [240] Search a 2D Matrix II
#

# @lc code=start
'''
Time Complexity - O(m*n). We traverse the entire matrix in the worst case
Space Complexity - O(1). No extra variables besides those for traversing the matrix

This code works on Leetcode
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n = len(matrix[0])
        i,j = 0, n-1
        while i >= 0 and i < len(matrix) and j >=0 and j<n: # defines the search bounds
            if matrix[i][j] == target:
                return True #return True if the current element is same as target
            elif target > matrix[i][j]: # if the target is greater than the current element then move down
                i+=1
            else: # else move to the left
                j-=1
        return False #return False if we reach outside the matrix.
        
# @lc code=end

