#TC: O(n)
#SC: O(1)
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix==None or len(matrix)==0: return False
        r=len(matrix)-1
        c=len(matrix[0])-1
        row=0
        col=c
        while(row<=r and col>=0):
                if target==matrix[row][col]: return True
                elif target<matrix[row][col]:
                    col-=1
                else: row+=1
        return False
