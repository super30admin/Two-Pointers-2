# The easy way to solve this is to maintain 2 pointers i and J at start and then count, if count exceeds 2 then I replace the j by  i else I keep incrementing i. Once I replace the element then we increment j.
#Time Complexity: O(n)
#Space Complexiyt: O(1)
def removeDuplicates(arr):
    if arr is None or len(arr) == 0 :
        return
    j = 1
    count = 1
    for i in range(1,len(arr)):
        if (arr[i] == arr[i-1]):
            count = count+1
        else:
            count = 1
        if count <=2:
            arr[j] = arr[i]
            j = j + 1
    return j

arr = [1,1,1,2,2,3]
idx = removeDuplicates(arr)
print(idx)
