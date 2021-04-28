# Problem2 (https://leetcode.com/problems/merge-sorted-array/)
# Time Complexity - O(m+n)
# Space complexity - O(1)


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        x = m-1
        y = n-1
        i = (m+n) - 1
        while(x >= 0 and y >= 0):
            if(nums1[x] < nums2[y]):
                nums1[i] = nums2[y]
                y -= 1
            else:
                nums1[i] = nums1[x]
                x -= 1
            i -= 1
        # Other while loop is not required to check, because nums1 is already sorted, so we only check if we reached the end of nums2
        while(y >= 0):
            nums1[i] = nums2[y]
            y -= 1
            i -= 1
