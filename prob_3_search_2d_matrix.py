class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        """
        Time Complexity: O(m + n)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach: 
            - we will start from top left corner of the matrix
            - if the value at that element is equal to target return True
            - if the value is greater then the target we will move to the left of that element and won't consider 
            the elements to the bottom of that as they are supposed to be greater than the target 
            - if the value is smaller then the target we will move down as the value to the left of that elements 
            are smaller then the target
        """        
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n - 1

        while (i < m and j >= 0):
            if matrix[i][j] == target:
                return True
            elif (matrix[i][j] < target):
                i = i + 1
            else:
                j = j - 1
        return False