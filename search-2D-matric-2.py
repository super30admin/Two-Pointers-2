# Take r=0 and c=no. of columns-1. While r and c is in range of rows and columns, 
# check if the elelmt at [r][c] is the target. if so, return true. If the element 
# is greater than target, move left else move down.

# Time complexity: O(r+c)
# Space complexity: O(1)

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        row=len(matrix)
        col=len(matrix[0])

        r=0
        c=col-1

        while r>=0 and r<=row-1 and c>=0 and c<=col-1:
            if matrix[r][c]==target:
                return True
            if matrix[r][c]<target:
                r+=1
            elif matrix[r][c]>target:
                c-=1
        return False
        
        