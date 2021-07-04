# Time Complexity :O(m+n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        #edge case
        if(len(matrix) == 0 or len(matrix[0]) == 0):
            return False
        height = len(matrix)
        width = len(matrix[0])
        
        row = height -1
        col = 0
        #check the last row first col
        while row >= 0 and col < width:
            # if target smaller than the current number decrease row
            if(matrix[row][col] > target):
                row -=1
            # if target bigger than current number increase col
            elif(matrix[row][col] < target):
                col +=1
            # if equal return true
            else:
                return True
        # if you reach edge return false
        return False