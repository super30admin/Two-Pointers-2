"""
Rasika Sasturkar
Time Complexity: O(m+n), m is no. of rows & n is no. of columns
Space Complexity: O(1)
"""


def searchMatrix(matrix, target: int) -> bool:
    """
    We can start with one of the side corners (i.e. top right or bottom left)
    so that we can make any decisions. We move the 2 pointers according to
    our target in either of the two directions.
    """
    # null case
    if matrix is None:
        return False

    m = len(matrix)
    n = len(matrix[0])

    # two pointers i & j starting from top right corner
    #         i, j = 0, (n-1)

    #         while i<m and j>=0:
    #             if matrix[i][j] == target:
    #                 return True
    #             if matrix[i][j] > target:
    #                 j -= 1
    #             else:
    #                 i += 1

    # two pointers i & j starting from bottom left corner
    i, j = (m - 1), 0

    while i >= 0 and j < n:
        if matrix[i][j] == target:
            return True
        if matrix[i][j] > target:
            i -= 1
        else:
            j += 1
    return False


def main():
    """
    Main function - examples from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    print(searchMatrix(matrix=[[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24],
                               [18, 21, 23, 26, 30]], target=5))  # returns True
    print(searchMatrix(matrix=[[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24],
                               [18, 21, 23, 26, 30]], target=20))  # returns False


if __name__ == "__main__":
    main()
