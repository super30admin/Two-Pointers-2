# Submitted Successfully
# TC=O(m+n), SC=O(1)
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m = len(matrix)
        n = len(matrix[0])

        # If we start from last element of first row, all elements below are larger and all elements to the left are smaller. We go forward with this thinking making sure that r and c do not go out of bounds.
        r = 0
        c = n-1
        while (c>=0 and r<=m-1):
            if matrix[r][c] < target: r+=1
            elif matrix[r][c] > target: c-=1
            else: return True
        return False

        # We can start from first element of last row as well. Similar approach.