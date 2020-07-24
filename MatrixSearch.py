class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix:
            return False
        
        row=0
        col=len(matrix[0])-1
        while row<len(matrix) and col>=0:
            if matrix[row][col]==target:
                return True
            if matrix[row][col]>target:
                col-=1
            else:
                row+=1
        return False  
        
Time complexity is O(m+n)
Space complexity is O(mn)
