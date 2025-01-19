# Two pointer approach. Two pointers on available max numbers in each array and appending in nums1 at ith index and filling all the remaining elements in second array
# TC: O(m + n)
# SC: O(1)
# Yes, this worked in leetcode

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        i = m + n - 1
        j = n - 1
        m = m - 1
        while i >= 0 and j >= 0:
            if m >= 0 and nums1[m] > nums2[j]:
                nums1[i] = nums1[m]
                m -= 1
            else:
                nums1[i] = nums2[j]
                j -= 1
            i -= 1
        while j >= 0:
            nums1[i] = nums2[j]
            j -= 1
            i -= 1