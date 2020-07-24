#https://leetcode.com/problems/merge-sorted-array/
# // Time Complexity : o(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : None
#
#
# // Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        cur = len(nums2) - 1
        l1 = m - 1
        l2 = n - 1

        for i in range(n + m - 1, -1, -1):
            print(i, l1, l2, nums1)
            if l2 == -1:
                return
            if nums1[l1] <= nums2[l2] or l1 == -1:
                nums1[i] = nums2[l2]
                l2 -= 1
            else:
                nums1[i] = nums1[l1]
                l1 -= 1
