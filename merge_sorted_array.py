"""
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.


"""
"""
Time Complexity: O(m+n)
Space Complexity: O(1)
"""


def merge(nums1, m, nums2, n):
    p1, p2, p3 = m-1, n-1, m+n-1

    while p1 > -1 and p2 > -1:
        if nums1[p1] > nums2[p2]:
            nums1[p3] = nums1[p1]
            p1 -= 1
        else:
            nums1[p3] = nums2[p2]
            p2 -= 1
        p3 -= 1

    while p2 > -1:
        nums1[p3] = nums2[p2]
        p2 -= 1
        p3 -= 1


nums1 = [1, 2, 3, 0, 0, 0]
nums2 = [2, 5, 6]
merge(nums1, 3, nums2, 3)
print(nums1)
