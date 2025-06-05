# Time Complexity : O(m+n)
# Space Complexity : O(1)
def search_2d_matrix(matrix, target)->bool:
    directions = [(-1,0), (1,0), (0,-1),(0,1)]
    up = 0
    down = 1
    left = 2
    right = 3
    i, j = len(matrix)-1, len(matrix[0])-1
    loc_i, loc_j = i, 0
    prev_val = matrix[loc_i][loc_j]
    if prev_val == target:
        return True

    if prev_val > target:
        dir = up
    else:
        dir = right
    new_loc_i = loc_i
    new_loc_j = loc_j
    while (new_loc_i != 0 and new_loc_j != j):
        new_loc_i = new_loc_i+directions[dir][0]
        new_loc_j = new_loc_j+directions[dir][1]
        val = matrix[new_loc_i][new_loc_j]
        if val == target:
            return True
        if val > target:
            dir = up
            prev_val = val
        elif val < target:
            dir = right
            prev_val = val
    return False
    

if __name__ == "__main__":
    matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
    target = 5
    print(search_2d_matrix(matrix, target))