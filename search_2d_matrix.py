#Time Complexity: O(n+m).
#Auxiliary Space: O(1)
#Did this code successfully run on leetcode :Yes

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        rows = len(matrix)-1
        cols = len(matrix[0])
        row_iter = 0
        col_iter = cols-1
        
        while(row_iter <= rows and col_iter>=0):
            if matrix[row_iter][col_iter]> target:
                col_iter = col_iter-1
            elif matrix[row_iter][col_iter] < target:
                row_iter = row_iter+1
            else:
                return True
        return False