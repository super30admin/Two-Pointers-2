'''
Time Complexity :O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation: Find if the vertical or horizontal is greater and iterate through the loops.
Apply binary search on both the row and column and keep doing this till you find the element.
'''
class Solution:
    def binarySearch(self, matrix, target, start, vertical):
        lo = start
        if vertical == True:
            high = len(matrix[0]) - 1
        else:
            high = len(matrix) - 1

        while lo <= high:
            mid = int(lo + ((high - lo) / 2))
            if vertical:
                if matrix[start][mid] < target:
                    lo = mid + 1
                elif matrix[start][mid] > target:
                    high = mid - 1
                else:
                    return True
            else:
                if matrix[mid][start] < target:
                    lo = mid + 1
                elif matrix[mid][start] > target:
                    high = mid - 1
                else:
                    return True
        return False

    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if matrix == None or len(matrix) == 0:
            return False

        short = min(len(matrix), len(matrix[0]))

        for i in range(0, short):
            vertical = self.binarySearch(matrix, target, i, True)
            horizontal = self.binarySearch(matrix, target, i, False)

            if vertical or horizontal:
                return True

        return False
