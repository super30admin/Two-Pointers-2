def search_matrix(maxtrix, target):
    if not matrix or not maxtrix[0]:
        return False
    rows, cols = len(maxtrix), len(maxtrix[0]) # no of rows and no of columns
    r, c = 0, cols-1 # pointers for row and col
    
    while r < rows and c >= 0:
        cur = maxtrix[r][c] # initially cur = 15 i.e top rightmost element
        if cur == target:
            return True
        elif cur > target:
            c-=1
        else:
            r+=1
    return False

matrix = [
    [1, 4, 7, 11, 15],
    [2, 5, 8, 12, 19],
    [3, 6, 9, 16, 22],
    [10, 13, 14, 17, 24],
    [18, 21, 23, 26, 30]
]
target = 5
print(search_matrix(matrix, target))  # Output: True

target = 20
print(search_matrix(matrix, target))  # Output: False

# if my target = 16; start at 15 i.e cur = 15
# cur = 15, 15<16 so r++ so cur =19
# cur = 19, 19>16 so c-- so cur =12
# cur = 12, 12<16 so r++ so cur =16
# cur = matrix[r][c]=16
# return true
