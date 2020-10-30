# Two pointer approach solves the problem easily, maintain a pointer at end of both arrays check which element is greater then append that to array nd drecrement pointer
# Time Complexity: O(n)
#Space complexity: O(n)
def merge(arr1,arr2,m,n):
    if (arr1 is None or arr2 is None or len(arr1)==0 or len(arr2)==0):
        return 0
    ptr1 = m - 1
    ptr2 = n - 1
    i = m + n - 1
    while (ptr1 >=0 and ptr2 >=0):
        if arr1[ptr1] > arr2[ptr2]:
            arr1[i] = arr1[ptr1]
            i = i - 1
            ptr1 = ptr1 - 1
        else:
            arr1[i] = arr2[ptr2]
            i = i - 1
            ptr2 = ptr2 - 1
    while (ptr2>=0):
        arr1[i] = arr2[ptr2]
        i = i - 1
        ptr2 = ptr2 - 1
    print(arr1)


nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3
merge(nums1,nums2,m,n)