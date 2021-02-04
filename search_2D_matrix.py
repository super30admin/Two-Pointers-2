'''
Time complexity: O(n + m)
Space complexity: O(1)
'''
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix is None or len(matrix) == 0 or len(matrix[0]) == 0:
            return False
        n = len(matrix)
        m = len(matrix[0])
        
        i = 0
        j = m - 1
        
        while i < n and j >= 0:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] < target: # As target is greater, go down the column
                i = i + 1
            else: # As target is lesser, go across the row
                j = j - 1
        return False