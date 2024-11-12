# TC: O(n)
# SC: O(1)

def searchMatrix(matrix, target):
    m = len(matrix) - 1
    n = 0
    size = len(matrix[0]) - 1
    if m == 0 and n == 0:
        return matrix[0][0] == target

    while m >= 0 and n < size:
        print(m, n)
        if matrix[m][n] > target:
            m -= 1
        elif matrix[m][n] < target:
            n += 1
        else:
            return True
    return False

