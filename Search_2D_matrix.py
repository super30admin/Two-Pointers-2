
def searchMatrix(matrix, target):
    # base case to check matrix or len(matrix) is null
    if len(matrix) == 0 or len(matrix[0]) == 0:
        return False

    # cache initial length and width
    height = len(matrix)
    width = len(matrix[0])

    # to begin our pointer in bottom up
    row = height - 1
    col = 0

    while col < width and row >= 0:
        if matrix[row][col] > target:
            row -= 1
        elif matrix[row][col] < target:
            col += 1
        else:
            return True

    return False


matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
target = 5
print(searchMatrix(matrix, target))

'''
Time complexity - O(n+m) n - rows and c - columns of matrix
Space complexity - O(1)
'''