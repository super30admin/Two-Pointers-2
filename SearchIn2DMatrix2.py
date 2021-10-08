# Time complexity: O(log n)
# Space complexity: O(1)

def searchMatrix(matrix, target):

    rowLen = len(matrix)
    colLen = len(matrix[0])

    row, col = rowLen-1, 0

    while row >= 0 and col < colLen:
        if target == matrix[row][col]:
            return True
        elif target < matrix[row][col]:
            row -= 1
        else:
            col += 1

    return False


print(searchMatrix([[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [
      3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]], 5))
print(searchMatrix([[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [
      3, 6, 9, 16, 22], [10, 13, 14, 17, 24], [18, 21, 23, 26, 30]], 0))
