############# Merge sorted array inplace  ############

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Using two pointers one to keep track of the element and the other the location to write and based on the count write the element

def merge_sorted(nums1,nums2,m,n):
    if not nums1 or not nums2:
        return 
    
    p1 = m-1
    p2 = n-1
    i = len(nums1)-1
    
    while p1>= 0 and p2>=0:
        if nums1[p1] > nums2[p2]:
            nums1[i] =  nums1[p1]
            i-=1
            p1-=1
        else:
            nums1[i] =  nums2[p2]
            i-=1
            p2-=1
    
    while p2 >=0:
        nums1[i] =  nums2[p2]
        i-=1
        p2-=1
