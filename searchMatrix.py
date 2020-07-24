#Search a 2D Matrix II
#Time Complexity : O(m+n). 
# Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#intialised index to be pointed to botto, left of array ie[n-1][0] then will check element at current index is equal to target if yes then return true , if value is greater than trget then increment roe else increment column

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix:
            return False
        n = len(matrix)
        m = len(matrix[0])
        j = 0
        i = n -1
        flag = False
        while i >=0 and j <m:
            if target == matrix[i][j]:
                return True
            elif target < matrix[i][j]:
                i = i - 1
            elif target > matrix[i][j]:
                j = j + 1
            
        return False