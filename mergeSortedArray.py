#// Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if n == 0:
            return nums1
        p1 = m - 1
        p2 = n - 1

        for c in range(m + n - 1, -1, -1):
            if p2 < 0:
                break
            if p1 >= 0 and nums1[p1] > nums2[p2]:
                nums1[c] = nums1[p1]
                p1 -= 1
            else:
                nums1[c] = nums2[p2]
                p2 -= 1

