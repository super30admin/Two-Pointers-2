"""
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
"""

def SortedArray(matrix, target):
        n = len(matrix)

        if n== 0:
            return False
        row = 0
        col = len(matrix[0])-1
        while row < len(matrix) and col >=0:
            if matrix[row][col] > target:
                col -= 1
            elif matrix[ row][col] < target:
                row += 1
            else:
                return True
        return False

"""
Time Complexity : O(n + m)
Space : O(1)

"""

"""
1) Row and column pointers are taken to iterate over the matrix
2) Based on wheather the target is smaller or larger than the current element, the search space is decided as the matrix is sorted.

"""
