# Time Complexity: O(m + n)
# Space Complexity: O(1)
class Solution(object):
    def searchMatrix(self, matrix, target):
        #         start one pointer at column level and one at row level
        p1 = 0  # column
        p2 = len(matrix) - 1  # end row

        #       iterate in matrix till both pointer reached their boundaries
        while p1 < len(matrix[0]) and p2 >= 0:
            #         if current value is less than target update the column pointer
            if matrix[p2][p1] < target:
                p1 += 1
            #             if less than target update row pointer
            elif matrix[p2][p1] > target:
                p2 -= 1
            #             else return true if the value is same as target
            else:
                return True
        #         return false as default value
        return False

        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
