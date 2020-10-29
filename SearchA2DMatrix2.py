#Time Complexity : O(n+m) where n is number of rows and m is the number of columns
#Space Complexity : O(1)

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Starting at the top right of the matrix, iterate either by reducing column by 1 if element is greater than target or increase row by if element is less than target.

#Your code here along with comments explaining your approach

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix or not matrix[0]:
            return False
        rows, cols = len(matrix), len(matrix[0])
        col, row = len(matrix[0])-1, 0

        while row < rows and col >= 0:
            #if we find target return True
            if target == matrix[row][col]:
                return True
            #if target is less than current element look to left of element
            elif target < matrix[row][col]:
                col -= 1
            #if target is more than current element look in the bottom
            else:
                row += 1

        return False
