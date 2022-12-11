Time Complexity: O(M+N) where M is no. of rows and N is no. of columns 
Space Complexity: O(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix:
            return False
        j = len(matrix[0])-1
        i = 0
        while j>=0 and i < len(matrix):
            if matrix[i][j] == target:
                return True
            if matrix[i][j] > target:
                j -= 1
            else:
                i += 1
        return False
