# Time Complexity: O(row+col)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : YES
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        col = len(matrix[0])-1
        row = 0
        while col >= 0 and row < len(matrix):
            if matrix[row][col] == target:
                return True
            elif matrix[row][col] > target:
                col-=1
            else:
                row +=1
        return False
                