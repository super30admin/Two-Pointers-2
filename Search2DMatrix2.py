class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        '''Time Complexity: O(m*n)
        Space Complexity: O(1)'''
        
        n=len(matrix)
        m=len(matrix[0])
        
        if n==0 or m==0:
            return False
        
        i=0
        j=m-1
        
        #Starting from the first row and last col
        while i < n and j >=0:
            if matrix[i][j]==target:
                return True
            #increment the row if element is < target
            elif matrix[i][j] < target:
                i+=1
            #else decrement the col
            else:
                j-=1
        return False
        
