## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix == [] or len(matrix)==0:
            return false
        m = len(matrix)
        n = len(matrix[0])
        i = 0 
        j = n-1
        while i<m and j>=0:
            if matrix[i][j]==target:
                return True 
            if target > matrix[i][j]:
                i=i+1
            else:
                j = j-1
        return False
    #Time Complexity: O(n)
    #Space Complexity: O(1)
    #Approach : Exploit the fact that the rows and columns are sorted. Use two pointers starting from the last column till the end. 
            