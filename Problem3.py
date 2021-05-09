# time : 0(m+n)
#space :0(1)
class Solution(object):
    def searchMatrix(self, matrix, target):
        
        m = len(matrix)
        n = len(matrix[0])
        
        i = 0
        j = n - 1
        
        while i < m and j >=0:
            if matrix[i][j] == target:
                return True
            
            elif matrix[i][j] < target:
                i = i +1
            else:
                j = j -1
                
        return False
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        