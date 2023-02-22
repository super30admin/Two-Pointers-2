# Submitted Successfully
# TC=O(m*logn), SC=O(1)
# Binary Search
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m = len(matrix)
        n = len(matrix[0])
        for i in range(m):
            # do not perform binary search in the rows which start with a value greater than target
            if matrix[i][0] <= target and target <= matrix[i][n-1]:
                L=0
                R=n-1
                while L<=R:
                    M=L+(R-L)/2
                    if matrix[i][M] < target:
                        L=M+1
                    elif matrix[i][M] > target:
                        R=M-1
                    else:
                        return True
        return False