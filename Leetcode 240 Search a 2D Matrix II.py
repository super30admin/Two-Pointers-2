# Time Complexity: O(m + n)
# Space Complexity: O(1)

def searchMatrix(matrix, target):
    if matrix is None or len(matrix) == 0:
        return False

    m = len(matrix)
    n = len(matrix[0])

    # top right
    r = 0
    c = n - 1
    while r < m and c >= 0:
        if target > matrix[r][c]:
            r += 1
        elif target < matrix[r][c]:
            c -= 1
        else:
            return True

    return False

