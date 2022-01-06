#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Use two pointers and compare values at [m-1]
#and [n - 1] and based on that assign values at the [m+n- 1] position of nums1 as we cannot use another auxiliary array.

#Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #two pointer solution, O(n) time and O(1) space.
        while m > 0 and n > 0:
            if nums1[m - 1] > nums2[n - 1]:
                nums1[m+n-1] = nums1[m - 1]
                m -= 1
            else:
                nums1[m+n-1] = nums2[n - 1]
                n -= 1
        while n > 0:
            nums1[m+n-1] = nums2[n - 1]
            n -= 1
