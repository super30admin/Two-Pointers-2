def BruteForce(nums, target):
    for j in range(len(nums[0])):
        for i in range(len(nums)):
            if nums[i][j] == target:
                return True
    return False


def pointers(matrix, target):
    '''
    approach: start from [0th raw, last col] element because we know rows and col
    are sorted. target is definitly left till it reach to right colum. once it reach
    to right coloum, only direction is downward.
    time complexity = O(r+c)
    space complexity = O(1)
    Working on LC = yes
    '''
    r = len(matrix) - 1 # row
    c = len(matrix[0]) - 1 # col
    if target < matrix[0][0] or target > matrix[r][c]:
        return False # if target is less than min or more than max, return False
    pt = [0, len(matrix[0]) - 1] # traversing cordinate
    while pt[0] <= r and pt[1] >= 0:
        if target == matrix[pt[0]][pt[1]]:
            return True
        elif target < matrix[pt[0]][pt[1]]:
            pt[1] -= 1 # moce left
        else:
            pt[0] += 1 # move down
    return False


# matrix = [[1, 4, 7, 11, 15], [2, 5, 8, 12, 19], [3, 6, 9, 16, 22], [10, 13, 14, 17, 23]]
matrix=[[1],[3],[5]]

print(BruteForce(matrix, 2))
print(pointers(matrix, 2))
