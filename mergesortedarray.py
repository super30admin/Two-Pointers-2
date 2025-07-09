# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Passed LeetCode
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m - 1
        j = n - 1
        k = m + n - 1

        while (i >= 0 and j >= 0):
            nums1[k] = max(nums1[i], nums2[j])  # adding the maximum value of two arrays from end of first array
            if nums1[i] > nums2[j]:
                i -= 1
            else:
                j -= 1
            k -= 1

        while j >= 0:  # if there are still elements in nums2 add them to first array in the beginning
            nums1[k] = nums2[j]
            k -= 1
            j -= 1


