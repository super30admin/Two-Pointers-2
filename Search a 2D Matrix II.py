# time complexity is o(m+n), where m,n is the number of rows and columns in matrix input
# space complexity is o(1)
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i = 0
        j = len(matrix[0]) - 1
        
        while(i < len(matrix) and j > -1):
            if(matrix[i][j] == target):
                return True
            if(matrix[i][j] < target):
                i += 1
            else:
                j -= 1
        return False
        