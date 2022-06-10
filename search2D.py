# Time Complexity: O(m+n)
# Space Complexity: O(1)
  
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        n = len(matrix[0])
        m = len(matrix)
        i = 0
        j = n - 1
        
        while i < m and j >= 0:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                j -= 1
            else:
                i += 1
        
        return False
        
