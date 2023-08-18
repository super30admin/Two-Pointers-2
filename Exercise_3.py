# ## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
# // Time Complexity :
# // Space Complexity :
# // Did this code successfully run on Leetcode :
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach
def searchMatrix(matrix, target):
    if len(matrix) == 0:
        return False
    # rows and cols
    rows = len(matrix)
    cols = len(matrix[0])
    # taking 2 ptrs for 1 element top - right
    r = 0
    c = cols - 1
    # iterating on the matrix
    while (r < rows and c >= 0):
        if matrix[r][c] == target:
            return True
        # if less than target
        if matrix[r][c] < target:
            # we shift one row ahead
            r += 1
        else:
            # else we shift one column back
            c -= 1
    # not present
    return False


matrix = [[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [
    3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]]
target = 5
print(searchMatrix(matrix, target))
