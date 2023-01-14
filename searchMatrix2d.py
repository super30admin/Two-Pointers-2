# Time Complexity :O(m+n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :Yes       
# Any problem you faced while coding this :No
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        p=len(matrix[0])-1
        while(p!=-1):
            if(matrix[0][p]==target):
                return True
            
            if(matrix[0][p]>target):
                p-=1
            else:
                for i in range(len(matrix)):
                    if(matrix[i][p]==target):
                        return True
                p-=1
                
        return False