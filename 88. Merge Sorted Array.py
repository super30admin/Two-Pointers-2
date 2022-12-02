# Time Complexity O(m+n)
# Space Complexity O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        k = len(nums1) - 1
        while m > 0 and n > 0:
            if nums1[m - 1] > nums2[n - 1]:
                nums1[k] = nums1[m - 1]
                m -= 1
                k -= 1
            else:
                nums1[k] = nums2[n - 1]
                n -= 1
                k -= 1
        while n > 0:
            nums1[k] = nums2[n - 1]
            n, k = n - 1, k - 1