#TimeComplexity:O(M+N) 
#SpaceComplexity: Constant Space
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix==None or len(matrix)==0:
            return None
        m=len(matrix);n=len(matrix[0])
        i=0;j=n-1
        while(i<m and j>=0):
            if matrix[i][j]==target:
                return True
            elif matrix[i][j]<target:
                i+=1
            else :
                j-=1
        return False
        