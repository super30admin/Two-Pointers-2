"""
https://leetcode.com/problems/search-a-2d-matrix-ii/
We take the a  pointer pointing to the first row's last element, since rows and columns are sorted
a value to the left of value in same row would be lesser and value at bottom row same column will be greater, so starting searhing
from row0 column last is that at every position we will have a choice to move either down or left based upon the size of the value. If number is > target
 we move to the left seeking smaller values else we move to down seeking larger values
 Tc: - O(m+n)
 SC: O(1)
 """


class Solution:
    def searchMatrix(self, matrix, target: int) :
        m=len(matrix)
        n=len(matrix[0])
        i=0
        j=n-1
        while i<m and j>=0:
            if matrix[i][j]==target:
                return True
            elif matrix[i][j]>target:
                j-=1
            else:
                i+=1
        return False





matrix = [[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]]
target = 20





