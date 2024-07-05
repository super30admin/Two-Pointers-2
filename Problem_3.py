"""
## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
TC: O(nLogm)
SC:O(1)
"""

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        n = len(matrix)
        m = len(matrix[0])
        top = 0
        
        left = 0
        right = m - 1
        
        while (top < n):
            while (left <= right):
                mid = (left + right)//2
                if(matrix[top][mid]) == target:
                    return True

                elif (matrix[top][mid] > target):
                    right = mid - 1

                else:
                    left = mid + 1
                    
            top += 1
            left = 0
            right = m - 1
           
                
        
        
        return False
        