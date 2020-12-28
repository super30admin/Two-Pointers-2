# TC : O(m + n) ; rows + cols
# SC : O(1)
# Approach: We start from upper right corner or lower left corners, because from there we can decide
# the direction to move on. From other to corners we cannot decide. So here we start from upper right
# if target > current element, we move down, else we move left. If we found return true, else return
# False in the end.

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or len(matrix) == 0:
            return False
        m = len(matrix); n = len(matrix[0])
        i = 0; j = n - 1
        while i < m and j >= 0:
            if matrix[i][j] == target:
                return True
            elif target > matrix[i][j]:
                i += 1
            else:
                j -= 1
                
        return False