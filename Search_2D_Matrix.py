  ---------------------- Search in a 2D array------------------------------------------------   
# Time Complexity : O(MXN) N is the length of the nums.
# Space Complexity : O(1) as I am returning the same array used for exploring numbers
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I searched the target element from the first row and last column, as the array is sorted from top to bottom and left to right in a row.
# If the element is greater than the target I will move left and If the element is less than the target, I will move from top to bottom. If the element is found, I will return True else false.


class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix:
            return False
        
        m = len(matrix)
        n = len(matrix[0])
        r = 0
        c = n-1
        while r<=m-1 and c>=0:
            if matrix[r][c] == target:
                return True
            elif matrix[r][c]>target:
                c -=1
            else:
                r +=1
        return False