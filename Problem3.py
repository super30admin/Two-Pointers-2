'''
Problem:Search a 2D Matrix II
Time Complexity: O(m+n)
Space Complexity: O(1)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        Start for the last row first col 
        compare target, if small then decrease row else increase col
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        i = m-1
        j = 0

        while i>=0 and j < n:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                i-=1
            else:
                j+=1
        
        return False