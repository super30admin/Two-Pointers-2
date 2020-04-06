"""
## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
Example:

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.

TIme - 0(m+n)
Space - 0(m+n)
LEETCODE - YES

#BRUTFORCE - SEARCH MATRIX FROM [0][0] INDEX EACH ELEMENT
"""

def SearchMatrix(Matrix, target):
    if len(Matrix) == 0 or Matrix == None:   # CHECK IF MATRIX IS EMPTY
        return
    rows=len(Matrix)   # CALCULATE ROWS
    cols=len(Matrix[0])  # # CALCULATE COLS
    r = 0      # AS ELEMENTS IN ROWS AND COLS ARE SORTED WE START FROM LAST ELEMENT OF ROW 1 SO r= 0 and col = cols-1
    c = cols-1

    while r < rows and c >=0 :
        if Matrix[r][c] == target:
            return True
        elif Matrix[r][c] > target:
            c -= 1
        else:
            r += 1
    return False

print(SearchMatrix([
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
], 5))
