from typing import List

"""

        Student :  Shahreen Shahjahan Psyche
        Time Complexity : O(M+N)
        Space Complexity : O(1)

"""

class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        # edge cases
        if not matrix:
            return False
        if not matrix[0]:
            return False
        
        
        m = len(matrix)
        n = len(matrix[0])
        
        i = m - 1
        j = 0
        
        while(i>=0 and j<=n-1):
            
            # checking whether target is found
            if matrix[i][j] == target:
                return True
            # if my current value is greater than target then I am moving upward
            # cause upward is smaller value
            elif matrix[i][j] > target:
                i -= 1
            # otherwise going to right
            else:
                j += 1
        
        # remarks for myself : The code wont work if we start from top-left 
        # corner or bottom-right corner. As in top right corner, both direction
        # values are smaller and almost the same problem at bottom right corner. 
        return False