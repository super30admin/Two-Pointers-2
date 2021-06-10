# Time Complexity : O(m+n) m rows and n columns
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#starting from top right or bottom left problem will be easy

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m,n = len(matrix),len(matrix[0])
        i,j = 0,n-1
        
        while i >=0 and i < m and j >=0 and j < n:
            if target == matrix[i][j]:
                return True
            elif target < matrix[i][j]:
                j -= 1
            else:
                i += 1
        return False