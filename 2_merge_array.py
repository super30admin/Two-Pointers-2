def pointerSolution(nums1,m,nums2,n):
    '''
    approach: use 3 pointers. high: store correct value, ptr1: for nums1 traverse from
    m to 0. ptr2: for nums2, traversed from n to 0. if nums1[ptr1]>nums2[ptr2] store
    high value at nums1[high].

    time complexity = O(m+n)
    space complexity = O(1)
    Working on LC = yes
    '''
    ptr1=m-1
    ptr2=n-1
    high=len(nums1)-1
    while ptr1>=0 and ptr2>=0 :
        if nums1[ptr1]>nums2[ptr2]:
            nums1[high]=nums1[ptr1]
            high -=1
            ptr1 -=1
        else:
            nums1[high]=nums2[ptr2]
            high -=1
            ptr2 -=1
    # if ptr2 does not reached.
    if ptr2>=0:
        while ptr2>=0:
            nums1[high]=nums2[ptr2]
            ptr2 -=1
            high -=1

nums1 = [1,2,3,4,0,0,0,0,0]
m=4
nums2 = [2,5,6,7,8]
n=5
# merge nums2 into 1
# output should be [1,2,2,3,5,6]

# print(Bruteforce(nums1,m,nums2,n))

pointerSolution(nums1,m,nums2,n)
print(nums1)