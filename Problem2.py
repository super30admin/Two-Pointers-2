# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int):
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1 = m - 1
        ptr2 = n - 1
        ptr = len(nums1) - 1
        while ptr1 >= 0 and ptr2 >= 0:
            if nums1[ptr1] > nums2[ptr2]:
                nums1[ptr] = nums1[ptr1]
                ptr -= 1
                ptr1 -= 1
            else:
                nums1[ptr] = nums2[ptr2]
                ptr -= 1
                ptr2 -= 1
        while ptr2 >= 0:
            nums1[ptr] = nums2[ptr2]
            ptr -= 1
            ptr2 -= 1


check = Solution()
print(check.merge([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3))
