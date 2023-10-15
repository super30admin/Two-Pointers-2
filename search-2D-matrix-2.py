
# Intuition 1: Brute Force
# Go through each element in 2D matrix and find the number
# TC: O(mxn) SC: O(1)

# Intuition 2:
# Each row is sorted so do binary search on each row. TC: O(m*logn) SC: O(1) where m = # of rows and n = # of colns. You can do opposite also and do binary search on each coln TC: (n*log m)

# Intuition 3:
# Start from one corner where one side increase and the other decreases. Check if your target is < or > than that corner. Move in the direction where you can get closer to the target.


class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m = len(matrix)
        n = len(matrix[0])

        row = 0
        col = n-1

        while row < m and col >= 0:
            if matrix[row][col] == target:
                print(row, col)
                return True
            elif matrix[row][col] > target:
                col = col - 1
            else:
                row = row + 1

        return False
