# Time Complexity : O(n+m), where n is the number of rows and m is the number of columns
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# Your code here along with comments explaining your approach
class Solution(object):
    # starting at the left bottom corner with two pointers corresponding to row and column,
    # compare every element to target, in case of equivalent number to target return True,
    # in case of a number greater than target move row pointer otherwise move column pointer.
    # the algorithm can also work starting from top-right corner and inverting the pointer movements.
    def searchMatrix(self, matrix, target):
        if not matrix:
            return False

        n, m = len(matrix), len(matrix[0])
        r, c = n-1, 0

        while r >= 0 and c < m:
            elem = matrix[r][c]
            if elem == target:
                return True
            elif elem > target:
                r -= 1
            else:
                c += 1

        return False


print(Solution().searchMatrix(
 [[1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]], 16))
