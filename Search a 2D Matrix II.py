class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix == None or len(matrix) == 0:
            return False
        
        m = len(matrix)
        n = len(matrix[0])
        r = 0
        c = n-1
        
        while (r<=m-1 and c>=0):
            if matrix[r][c] == target:
                return target
            if matrix[r][c] > target:
                c -=1
            else:
                r +=1
        return False
            
        
        
