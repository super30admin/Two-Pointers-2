
# Time Complexity : O(m+n)
# Space Complexity : 0(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach



class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix == None or len(matrix) ==0:
            return False
        m = len(matrix)
        n = len(matrix[0])
        i = m-1
        j=0
        while i>=0 and j<n:
            if matrix[i][j] == target:
                return True
            elif target> matrix[i][j]:
                j+=1
            else:
                i-=1
        return False