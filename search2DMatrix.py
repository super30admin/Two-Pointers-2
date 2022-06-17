'''
-- Passed test cases on LeetCode
'''
class Solution:
    #O(m + n) -- Time Complexity ; O(1) -- Space Complexity
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix) 
        n = len(matrix[0]) 
        i = 0
        j = n - 1 
        while (i < m and j >=0 ):
            if target == matrix[i][j]:
                return True
            elif target > matrix[i][j]:
                i += 1
            else:
                j -= 1
        return False
            
            
            
        
