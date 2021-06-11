#Time complexity: O(m*n)   
#Space complexity: O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        i,j = 0,len(matrix[0])-1
        #start from top right element, move down if target is greater than the element, move left instead
        while i<len(matrix) and j>=0:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j]<target:
                i+=1
            else:
                j-=1
        return False
                
        