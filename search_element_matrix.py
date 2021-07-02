// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
we start a pointer p at either edge of the anti diagonal or the start of the anti diagonal.if the target is less than the matrix value we move column wise else we move row wise.If the target is equal to the matrix value we return true else we return false.


class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        if len(matrix)==0 or matrix==None:
            return False
        r=0
        c=len(matrix[0])-1        
        while (0<=r<=len(matrix)-1 and 0<=c<=len(matrix[0])):
            if matrix[r][c]<target:
                r=r+1
            elif matrix[r][c]>target:
                c=c-1
            else:
                return True
        return False
        