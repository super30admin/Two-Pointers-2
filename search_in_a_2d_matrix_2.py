# Time Complexity:- O(m+n)
# Space Complexity:- O(1)
# Approach:- Start from the top right corner, the number at the index is less than target we might probably find the target down in the array but definitely not on the left as the entire column is sorted, so we increase i, if the number at the index is greater than the target we might probably find the target on the left but definitely not down in the column as the entire column is sorted. We keep on doing this until we are in the bounds.
class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix or len(matrix[0])==0:
            return False
        i=0
        j=len(matrix[0])-1
        while(i<len(matrix) and j<len(matrix[0]) and i>=0 and j>=0):
            if matrix[i][j]==target:
                return True
            # number at index<target we need to go down
            if matrix[i][j]<target:
                i+=1
            else:
                # number at index>target we need to go left
                j-=1
        return False