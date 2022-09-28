"""
https://leetcode.com/problems/merge-sorted-array/

TC - O(m+n) - since traversing through both the arrays
SC - O(1) -  since no extra space is used
"""
nums1 = [1, 2, 3, 0, 0, 0]
m = 3
nums2 = [2, 5, 6]
n = 3


def mergeSortedArr(nums1, m, nums2, n):
    if nums1 is None or len(nums1) == 0: return

    p1 = m - 1
    p2 = n - 1
    p3 = m + n - 1

    while p1 >= 0 and p2 >= 0:
        if nums1[p1] > nums2[p2]:
            nums1[p3] = nums1[p1]
            p1 -= 1
        else:
            nums1[p3] = nums2[p2]
            p2 -= 1
        p3 -= 1
    while p2 >= 0:
        nums1[p3] = nums2[p2]
        p2 -= 1
        p3 -= 1

    # return nums1


print(mergeSortedArr(nums1, m, nums2, n))
