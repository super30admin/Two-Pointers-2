# TC = O(n) 
# SC = O(1)
# We use 3 pointers: p1- pointer at the last index of element of array1 before the zeros, p2- pointer at last element of array2 & p- pointer at last index of array1.
# We build the array1 from last index- higher of the two pointers are considered each time and considered pointer is moved inwards. There may be situation where p1 pointer finishes of before p2. We need to copy the remaining elements of array 2 to respective places in array 1. If p2 completes before- we are good! 
def merge(nums1, nums2,m, n):
    p1 = m-1
    p2 = n-1
    p = m+n-1
    while p1>=0 and p2>=0:
        if nums2[p2] > nums1[p1]:
            nums1[p] = nums2[p2]
            p2 -= 1
        else:
            nums1[p] = nums1[p1]
            p1 -= 1
        p -= 1
    print(p)
    print(p2)
    while p2 >= 0:
        nums1[p] = nums2[p2] 
        p2 -= 1
        p -= 1
    return nums1

nums1 = [1,2,3,0,0,0]
nums2 = [2,5,6]
m, n = 3,3
print(merge(nums1, nums2, m, n))



