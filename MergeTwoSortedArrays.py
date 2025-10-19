# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
Keep a pointer at each arrays last element and another pointer at the (m+n) spot where we can insert the max value.
'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        p1 = m-1
        p2 = n-1
        spot = (m+n)-1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] >= nums2[p2]:
                nums1[spot] = nums1[p1]
                p1 -= 1
            else:
                nums1[spot] = nums2[p2]
                p2 -= 1
            
            spot -= 1

        while p2 >= 0:
            nums1[spot] = nums2[p2]
            spot -= 1
            p2 -= 1
