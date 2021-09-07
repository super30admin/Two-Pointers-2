# Did this code successfully run on Leetcode : YES

# approach
# cannot use binary search since rows[i][-1] is not guaranteed to be greater than rows[i+1][0]
# rows and columns are individually sorted
# use 2 pointers
# start from top-right or bottom-left
# at every coordinate we have a decision to make
# if matrix[i][j] == target: good, we found
# if matrix[i][j] > target: go in the direction the values are smaller
# else: go in the direction values are larger

# TC: O(m+n) worst case we will traverse an entire row and column
# SC: O(1)

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        # starting from top-right
        i, j = 0, n-1
        while 0 <= i < m and 0 <= j < n:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                j -= 1
            else:
                i += 1
        return False


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        # starting from bottom-left
        i, j = m-1, 0
        while 0 <= i < m and 0 <= j < n:
            if matrix[i][j] == target:
                return True
            elif matrix[i][j] > target:
                i -= 1
            else:
                j += 1
        return False