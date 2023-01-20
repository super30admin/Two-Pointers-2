# 88. Merge Sorted Array


# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No 

# using for loop and two pointer


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1 # pointer at end of numbers of nums1
        p2 = n-1 # pointer at end of num2 (because sorted in increasing order)
        idx = m+n-1
        while p2>=0 and p1 >=0: #O(n)
            if nums1[p1] <= nums2[p2]:
                nums1[idx] = nums2[p2]
                p2 = p2 - 1
            else:
                nums1[idx] = nums1[p1]
                p1 = p1 - 1
            idx -= 1
        # one array is bigger
        while p2>=0:
            nums1[idx] = nums2[p2]
            p2-=1
            idx -= 1
