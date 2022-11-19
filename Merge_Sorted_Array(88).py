# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode: Yes
# Three line explanation of solution in plain english

# Here we 3 pointer:
# 1 in the end of the first list(where elements are present):first
# 1 at the end of the second list:second
# 1 at the very end of the first list where zeroes are present : position

# we compare the elements and at first and second and whichever is larger we replace that at the position pointer
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        first = m-1
        second = n-1
        position = m+n-1
        while (first>=0) and (second>=0):
            if nums2[second] > nums1[first]:
                nums1[position] = nums2[second]
                second-=1
            else:
                nums1[position] = nums1[first]
                first-=1
            position-=1

        # in case the elements in the second array are still left we need to add them to starting of the
        # first array
        while second>=0:
            nums1[position] = nums2[second]
            second-=1
            position-=1


        # while (n >= 1):
        #     if (m >= 1) and (nums1[m-1] >= nums2[n-1]):
        #         nums1[m+n-1] = nums1[m-1]
        #         m -=1
        #     else:
        #         nums1[m+n-1] = nums2[n-1]
        #         n-=1

