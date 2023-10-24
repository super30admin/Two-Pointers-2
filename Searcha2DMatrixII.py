#Time Complexity : O(m+n) since we iterate through the column and row. 
#Space Complexity : O(1) since we are not using any extra space
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: We take a pointer at top right or bottom left corner (as we have now 2 options to move since neighbouring elements are
# either greater or smaller). If the element at the pointer is smaller than the target, we move the row else we move the column 
# by  1

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or len(matrix) == 0: return False
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = n-1
        while (i<m and j >=0):
            if matrix[i][j] == target: return True
            elif matrix[i][j] < target:
                i += 1
            else:
                j -= 1
        return False  
