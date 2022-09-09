# Time Complexity: O(m+n)
# Space Complexity: O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if len(matrix) == 0 or matrix is None: return
        if len(matrix) == 1 and len(matrix[0]) == 1 and matrix[0][0] == target:
            return True
        # if len(matrix) == 1
        m = len(matrix) #1
        n = len(matrix[0]) #2
        i = 0  #0
        j = n-1  #0,1
        while(i < m and j > -1): 
            if matrix[i][j] == target:
                return True
            if matrix[i][j] > target:
                j -= 1
            if matrix[i][j] < target:
                i += 1
        return False