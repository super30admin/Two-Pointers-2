#TC O(m+n) and SC O(1) 
#two pointer approach with top right element as starting point
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix == None or len(matrix) == 0:
            return False
        m = len(matrix) #rows
        n = len(matrix[0]) #cols
        row = 0
        col = n - 1
        while row < m and col >= 0:
            if matrix[row][col] == target:
                return True
            elif target > matrix[row][col]:
                row = row + 1
            else:
                col = col - 1
        return False




#TC O(m+n) and SC O(1) 
#two pointer approach with left bottom element as starting point
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if matrix == None or len(matrix) == 0:
            return False
        m = len(matrix) #rows
        n = len(matrix[0]) #cols
        row = m - 1
        col = 0
        while row >= 0 and col < n:
            if matrix[row][col] == target:
                return True
            elif target > matrix[row][col]:
                col = col + 1
            else:
                row = row - 1
        return False

