# Time Complexity :O(n+m)
# Space Complexity :O(1)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 240

# Write an efficient algorithm that searches for a target value in an m x n integer matrix.
# The matrix has the following properties:
#
# Integers in each row are sorted in ascending from left to right.
# Integers in each column are sorted in ascending from top to bottom.

# Example 1:
#
#
# Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
# Output: true
# Example 2:
#
#
# Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
# Output: false


def main():
    matrix = [[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 24],
              [18, 21, 23, 26, 30]]
    target = 5
    ans = searchMatrix(matrix,target)
    print(ans)
def searchMatrix(matrix, target):
    """
    :type matrix: List[List[int]]
    :type target: int
    :rtype: bool
    """

    # If the matrix is null return False.
    if not matrix:
        return False

    # The idea here is to start at top right or bottom left.
    # why?
    # Because we can have 2 different directions from that point, If we start from top left then that position is 0,0. From that position i + 1 and j + 1 both will be higher.
    # From bottom right both values j - 1 and i - 1 both values will be smaller.
    i = 0
    j = len(matrix[0]) - 1

    # If you think, I can go max till below i.e. last row and j can max come to the first row.
    while (i < len(matrix) and j >= 0):
        # According to property if the target is greater that means it has to go down because column is sorted ascending to descending.
        if target > matrix[i][j]:
            i += 1
        # If it is smaller then we go left.
        elif target < matrix[i][j]:
            j -= 1
        else:
            # If we find we return true else false.
            return True
    return False

if __name__ == '__main__':
    main()