
# Merge Sorted Arrays LC_88
# Time Complexity : O(N)
# Space Complexity : O(1)
def merge(nums1,nums2,m,n):
    last_index = m+n-1
    #merging in reverse order
    while m>0 and n>0:
        if nums1[m-1] > nums2[n-1]:
            nums1[last_index] = nums1[m-1]
            m-=1
        else:
            nums1[last_index] = nums2[n-1]
            n-=1
        last_index-=1
    
    #filling nums1 with leftover values in nums2
    while n>0:
        nums1[last_index] = nums2[n-1]
        n,last_index = n-1,last_index-1

