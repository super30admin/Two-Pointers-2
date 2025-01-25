# tc O(m + n), sc O(1).
COLUMNS = len(matrix[0])
row, column = 0, COLUMNS - 1

while row < len(matrix) and column >= 0:
    if matrix[row][column] == target:
        return True
    if matrix[row][column] < target:
        row += 1
    else:
        column -= 1
return False