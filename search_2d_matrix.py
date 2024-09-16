# Approach: Brute Force would be to loop over rows and cols and find the element
# Time : O(N^2)

# Optimized approach - Use 2 pointers
# Time - O(M + N)
# Space - O(1)


def searchMatrix(matrix, target):
    if not matrix:
        return False

    # start from top col value to use the sorted property of matrix
    row = 0
    col = len(matrix[0]) - 1

    while row < len(matrix) and col >= 0:
        if matrix[row][col] > target:
            col -= 1

        elif matrix[row][col] < target:
            row += 1


        else:
            return True

    return False

