# Did this code successfully run on Leetcode : YES

# approach
# start from largest elements of both (from the right ends -> arrays are already sorted)
# keep filling the larger element - if nums2[i] > nums1[j] fill empty space in nums1 by nums2[i] else by nums1[j]

# TC: O(m+n)
# SC: O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        fill = m+n-1
        ptr1 = m-1
        ptr2 = n-1
        while ptr1 >= 0 and ptr2 >= 0:
            if nums2[ptr2] >= nums1[ptr1]:
                nums1[fill] = nums2[ptr2]
                fill -= 1
                ptr2 -= 1
            else:
                nums1[fill] = nums1[ptr1]
                fill -= 1
                ptr1 -= 1
        while ptr2 >= 0:
            nums1[fill] = nums2[ptr2]
            fill -= 1
            ptr2 -= 1