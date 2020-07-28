#Time complexity: O(m+n)
#Space complexity: O(1)
# Worked on leetcode: yes
# This algorithm uses 2 pointer approach: row pointer, column pointer. Both pointer starts from the element corresponding to the first row, last column,
# Iteratively the element is compared with the target.
# If target > element, row is incremented, else column is decremented.

def searchMatrix(matrix, target):
    """
    :type matrix: List[List[int]]
    :type target: int
    :rtype: bool
    """
    if len(matrix) == 0 or len(matrix[0]) == 0: return False

    m = len(matrix)
    n = len(matrix[0])
    i = 0
    j = n - 1  # we start from first row, last column element

    while (i < m and j >= 0):  # since we are always going left and bottom, we never check the other direction
        if (matrix[i][j] == target):
            return True
        elif matrix[i][j] > target:
            j = j - 1
        else:
            i = i + 1

    return False



print(searchMatrix([[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], 5))