class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        if matrix is None or len(matrix)==0:
            return False
        row  = 0
        column = len(matrix[0])-1
        while (row>=0 and column>=0 and row<=len(matrix)-1 and column<=len(matrix[0])-1):
            if matrix[row][column] == target:
                return True
            elif matrix[row][column] > target:
                column-=1
            else:
                row+=1

        return False