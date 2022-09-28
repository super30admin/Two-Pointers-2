"""
https://leetcode.com/problems/search-a-2d-matrix-ii/

Approach --
1. Use a pointer which is located in 1st row, last column or 1 column last row
Note - pointer is chosen to be in either of these two locations since choosing [0,0] and [lastrow, last col],
we don't get correct direction since the elements are in [increasing, increasing] order or [dec, dec] order resp
2. If target is greater than current element, increase row. else decrease column
3. Return true if element found. Else False.

TC - O(m + n)
SC - O(1)
"""

mat = [[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]]
target = 5


def search2DMatrix(matrix):
    m = len(matrix)
    n = len(matrix[0])

    # start top row last col
    r = 0
    c = n - 1
    # if we were to start in bottom row and left col
    # r = m-1
    # c = 0
    while r < m and c >= 0:
        if matrix[r][c] < target:
            r += 1
        elif matrix[r][c] > target:
            c -= 1
        else:
            return True
    return False


print(search2DMatrix(mat))
