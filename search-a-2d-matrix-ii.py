# Time Complexity: O(m + n) where m and n are the sizes of two lists
# Space Complexity: O(1)

# The code successfully ran on leetcode

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) == 0 or matrix == None: return False
        
        m = len(matrix)
        n = len(matrix[0])
        r = 0
        c = n - 1
        
        while r < m and c >= 0:
            if matrix[r][c] < target: r += 1
            
            elif matrix[r][c] > target: c -= 1
            
            else: return True
            
        return False
        
                