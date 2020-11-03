"""
Time complexity O(M+N)
Space Complexity O(1)

"""

class Solution_searchMatrix:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix is None or len(matrix)==0:
            return False
        m=len(matrix)
        n =len(matrix[0])
        i=0 
        j=n-1
        while(i<m and j>=0):
            if matrix[i][j]==target:
                return True
            elif matrix[i][j]>target:
                j-=1
            else:
                i+=1
        return False