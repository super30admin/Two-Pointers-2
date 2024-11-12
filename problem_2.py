# TC: O(n)
# SC: O(1)

def merge(nums1, m, nums2, n):
    """
    Do not return anything, modify nums1 in-place instead.
    """  
    i = m - 1
    j = n - 1
    k = m + n - 1

    while j >= 0:
        print(i, j, k)
        if nums1[i] > nums2[j]:
            nums1[k] = nums1[i]
            i -= 1
        else:
            nums1[k] = nums2[j]
            j -= 1
        k -= 1

    print(nums1)
