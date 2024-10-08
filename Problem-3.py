# T.C = O(m+n) S.C = O(1)
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m = len(matrix)
        n = len(matrix[0])
        r = m-1
        c = 0

        while(r>=0 and c<n):
            if(matrix[r][c] == target):
                return True
            elif(matrix[r][c] < target):
                c+=1
            else:
                r-=1

        return False
        