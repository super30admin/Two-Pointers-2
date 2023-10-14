# Time Complexity : O(m+n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        i=0
        m=len(matrix)
        n=len(matrix[0])
        j=n-1
        while(j>=0 and i<m):
            if(matrix[i][j]==target):
                return True
            elif(matrix[i][j]> target):
                j-=1
            elif(matrix[i][j]<target):
                i+=1
        return False

