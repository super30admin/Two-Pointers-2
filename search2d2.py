# Time Complexity: O(m+n), in the worst case, we'll go from bottom to the top row and from the left most to the right most element, i.e. m+n. 
# Space Complexity: O(1), We don't use any additional auxiliary data structure in the size of m or n. 
def searchMatrix(m: list[list[int]], target: int) -> bool:
    if not m or len(m) == 0:
        return False
    i = len(m)-1
    j = 0
    while i >= 0 and j < len(m[0]):
        if m[i][j] == target:
            return True
        elif m[i][j] < target:
            j+=1
        else:
            i-=1
    return False