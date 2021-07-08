"""
// Time Complexity : O(logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Trying to come with intuitve soln of
negative indexing

// Your code here along with comments explaining your approach
Algorithm Explanation
Brute force - Linear scan in the matrix - n2
- We analyse the reverse L shaped pattern, where each element has left element less than it
and down element greater than it.
- So we can apply binary search, while updating and row and col index
- Iterating over the rows and columns
    - if value == mat[r][c]
        return True
    - If value < mat[r][c] then c = c - 1 # go left
    - Else r = r + 1
"""
class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m = len(matrix)
        if not m:
            return False
        n = len(matrix[0])
        
        r,c = 0,n-1
        
        while r < m and c >=0:
            if matrix[r][c] == target:
                return True
            # element is to down of the element
            elif matrix[r][c] < target:
                #if r < m-1:
                r = r+1
            else:
                # element is to left of the element
                #if c > 0:
                c=c-1
        return False
                
        