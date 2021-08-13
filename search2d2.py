# Time Complexity: O(), 
# Space Complexity: O(), 
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