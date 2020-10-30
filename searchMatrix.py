
# As the matrix is sorted in particular manner I can start by targetting corner element, then if it is smaller then increment row else decrement column. 
#Time Complexity: O(m+n)
#Space complexity: O(1)
def searchMtrix(arr, target):
    if arr is None or len(arr) == 0:
        return False
    p1 = arr[0][len(arr)-1]
    m  = len(arr)
    n = len(arr[0])
    i = 0
    j = n-1
    while (i<m and j>=0 ):
        if (arr[i][j] == target): 
            return True
        if (arr[i][j] < target):
            i = i + 1
        else:
            j = j - 1
    return False



arr = [ [1,   4,  7, 11, 15],
        [2,   5,  8, 12, 19],
        [3,   6,  9, 16, 22],
        [10, 13, 14, 17, 24],
        [18, 21, 23, 26, 30]]
ans = searchMtrix(arr,18)
print(ans)