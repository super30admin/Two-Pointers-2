'''

## Problem 240: Search a 2D Matrix II

## Author: Neha Doiphode
## Date:   07-12-2022

## Description
    Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
    This matrix has the following properties:
    Integers in each row are sorted in ascending from left to right.
    Integers in each column are sorted in ascending from top to bottom.

## Examples:
    Example 1:
        Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
        Output: true

                  1   4   7   11  15
                  2   5   8   12  19
                  3   6   9   16  22
                 10  13  14   17  24
                 18  21  23   26  30

    Example 2:
        Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
        Output: false

## Constraints:
    m == matrix.length
    n == matrix[i].length
    1 <= n, m <= 300
    -109 <= matrix[i][j] <= 109
    All the integers in each row are sorted in ascending order.
    All the integers in each column are sorted in ascending order.
    -109 <= target <= 109

## Time complexity: O(m + n), where m is number of rows and n is number of columns.
                              With the approach used we only move in either direction.
                              We either change a row or a column 1 at a time.

## Space complexity: O(1), No auxiliary space is used.

'''

from typing import List

def get_input():
    print("Enter the number of rows of the matrix: ", end = "")
    rows = int(input())
    print("Enter the number of columns of the matrix: ", end = "")
    columns = int(input())
    input_matrix = []
    for row in range(rows):
        l = []
        print(f"Row {row + 1}: ")
        for column in range(columns):
            inp = int(input())
            l.append(inp)
        input_matrix.append(l)

    print("Enter the target element to be searched in the 2D matrix: ", end = "")
    target = int(input())

    return input_matrix, target

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        # Edge case:
        if not len(matrix):
            return False

        m = len(matrix)         # rows
        n = len(matrix[0])      # columns

        '''
        We are going start searching from top-right corner of the matrix
        We can choose either top-right or bottom-left corners to start the search as,
            those 2 corners give us "deterministic" directions to search the element
        Top - Right:
            If we move left, elements decrese.
            If we move down, elements increase.

        Bottom - Left:
            If we move right, elements increase.
            If we move up,    elements decrease.

        We can choose either of the above to start our search.

        We CAN NOT choose top-left(0, 0) or bottom-right(m, n), as they don't give us "deterministic" directions
        to continue our search.
        Top-Left    : Elemenets keep on increasing regardless of the direction we move(to right or to bottom).
        Bottom-Right: Elemenets keep on decreasing regardless of the direction we move(to left  or to up).

        Approach below, we are choosing to start our search from Top-Right corner.
        '''

        row = 0
        column = n - 1

        while row < m and column >= 0:
            if target == matrix[row][column]:
                return True

            if target < matrix[row][column]:
                # Move towards left
                column -= 1
            else:
                row += 1

        return False

# Driver code
solution = Solution()
matrix, target = get_input()
print(f"Input matrix: {matrix}")
print(f"Input target to be searched: {target}")
print(f"Output: True = Target present in the matrix. False = Target not present in the matrix: {solution.searchMatrix(matrix, target)}")
