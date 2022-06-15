class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        column = len(matrix[0])-1
        row = 0
        
        while column > -1 and row < len(matrix):
            if matrix[row][column] == target :
                return True
            elif matrix[row][column] > target :
                column -= 1
            else:
                row += 1
        return False
