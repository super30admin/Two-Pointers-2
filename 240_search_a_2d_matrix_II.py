from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        """
            https://leetcode.com/problems/search-a-2d-matrix-ii/
            // Time Complexity : O(m+n)
                    The left most element (first row and last column)
                    is the worst case
            // Space Complexity : O(1)
            // Did this code successfully run on Leetcode : Yes
            // Three line explanation of solution in plain english :
                - Start from the first row and last column
                - Three cases:
                        - Match -> return True
                        - Current element > target -> Decrement Column
                        - Current element < target -> Increment Row
                - Loop until we are with in the bounds
                        (row pointer <= no. of rows and col pointer >= 0)
        """
        # edge case
        if not matrix:
            return False

        # total number of rows and columns
        rows, cols = len(matrix) - 1, len(matrix[0]) - 1
        # row and col pointer
        row, col = 0, cols

        while row <= rows and col >= 0:

            # case 1
            # we found a match
            if matrix[row][col] == target:
                return True

            # case 2
            # current element is greater than target
            elif matrix[row][col] > target:
                # decrease column
                col -= 1

            # case 3
            # current element is less than target
            else:
                # increase row
                row += 1

        return False


if __name__ == '__main__':
    h = Solution()
    print(h.searchMatrix([
        [1, 4, 7, 11, 15],
        [2, 5, 8, 12, 19],
        [3, 6, 9, 16, 22],
        [10, 13, 14, 17, 24],
        [18, 21, 23, 26, 30]
    ], 0))
    print(h.searchMatrix([
        [1, 4, 7, 11, 15],
        [2, 5, 8, 12, 19],
        [3, 6, 9, 16, 22],
        [10, 13, 14, 17, 24],
        [18, 21, 23, 26, 30]
    ], 20))
    print(h.searchMatrix([
        [1, 4, 7, 11, 15]
    ], 20))
    print(h.searchMatrix([
        [1],
        [4],
        [7],
        [11],
        [15]
    ], -20))
    print(h.searchMatrix([], 200))
