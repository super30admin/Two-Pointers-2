# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        f = m-1
        s = n-1
        t = m+n-1

        while s > -1:
            if f >= 0 and nums1[f] >= nums2[s]:
                nums1[t] = nums1[f]
                f -= 1
            else:
                nums1[t] = nums2[s]
                s -= 1
            t -= 1
        