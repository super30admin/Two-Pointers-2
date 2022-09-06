#tc: O(m+n)
#sc: O(1)
class Solution:
    def searchMatrix(self, matrix, target: int) -> bool:
        
        if len(matrix) == 1 and len(matrix[0]) == 1: return matrix[0][0] == target
        i = 0
        j = len(matrix[0])-1
        while(i >= 0 and i<len(matrix) and j>=0 and j<len(matrix[0])):
            if matrix[i][j] == target: return True
            elif matrix[i][j] > target: j -= 1
            else: i += 1
        return False