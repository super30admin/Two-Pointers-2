# Time Complexity :
# O(m+n) , given the matrix, row elements decreading and cokumn elements increasing, 
           # in worst case, we end up checking m+n elements for finding target


# Space Complexity :  
# O(1) 


# Approach:
# 



class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix or len(matrix) == 0:
            return False

        rows = len(matrix)
        cols = len(matrix[0])

        # Approach of finding from top-right corner (Can also do from bottom-left corner)
        row = 0
        col = cols-1

        while(row < rows and col >= 0):
            if (matrix[row][col] == target):
                return True
            elif target < matrix[row][col]:
                col = col - 1
            else:
                row = row + 1

        return False 