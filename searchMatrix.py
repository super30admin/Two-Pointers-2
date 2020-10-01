class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool

        # Time Complexity: O(m.n)

        # Space Complexity: O(n)

        Accepcted.

        """
        if len(matrix)==0:
            return False
        m, n = len(matrix), len(matrix[0])
        i, j = 0, n-1
        while(i<m and j>=0):
            if matrix[i][j]==target:
                return True
            # if greater then you should move to smaller element in that list
            elif matrix[i][j]> target:
                j-=1
            else:
                i+=1
        return False