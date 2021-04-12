# Time Complexity is O(m+n), space complexity is O(1)
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        i = 0
        j = len(matrix[0])-1
        while(i < len(matrix) and j >= 0):
            el = matrix[i][j]
            if(target == el):
                return True
            elif(target > el):
                i+=1
            else:
                j-=1
        return False