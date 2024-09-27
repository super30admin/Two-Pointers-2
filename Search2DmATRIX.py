#Time Complexity :O(N) where N is number of inouts
#Space Complexity : O(1)
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if len(matrix) ==0:
            return False
        n = len(matrix)
        m = len(matrix[0])
        r = 0
        c = m-1
        while(r < n and c >=0):
            if matrix[r][c] == target:
                return True
            elif matrix[r][c] > target:
                 c-=1
            else:
                r+=1
        return False