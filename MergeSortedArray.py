# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :

# Your code here along with comments explaining your approach
# Using two pointers first and second where first starts from end of nums1 array and second starts from end of nums2 array
# If first < second then assign i to second otherwise set i to first


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int],
              n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if len(nums1) == 0 and len(nums2) == 0:
            return None
        if len(nums2) == 0:
            return nums1
        first = m - 1
        second = n - 1
        i = m + n - 1
        while first >= 0 and second >= 0:
            if nums1[first] <= nums2[second]:
                nums1[i] = nums2[second]
                second -= 1
            else:
                nums1[i] = nums1[first]
                first -= 1
            i -= 1
        nums1[:second + 1] = nums2[:second + 1]
        return nums1
