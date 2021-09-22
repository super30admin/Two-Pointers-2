# Time Complexity: O(max(m,n)), Using two pointers, we look at each array once
# Space Complexity: O(1), We modify the first array in place

def merge(nums1: list[int], m: int, nums2: list[int], n: int) -> None:
    """
    Do not return anything, modify nums1 in-place instead.
    """
    # nums1 = [x,x,x,x,x,x,x,x,x,x,0,0,0,0,0,0,0]
    #                            i             k
    # nums2 = [y,y,y,y,y,y,y]
    #                      j
    i = m - 1
    j = n - 1
    k = m+n - 1
    while i >= 0 and j >= 0:
        if nums1[i] > nums2[j]:
            nums1[k] = nums1[i]
            i-=1
        else:
            nums1[k] = nums2[j]
            j-=1
        k-=1
    while j >=0:
        nums1[k] = nums2[j]
        j-=1
        k-=1