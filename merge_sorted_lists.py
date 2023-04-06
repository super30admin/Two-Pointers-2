# Time Complexity: O(n+m) because we are iterating through both the arrays once
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
In this code we are merging two sorted arrays in-place by creating three pointers. The 
first pointer tracks the end of the first array, the second pointer tracks the end of 
the second array and the third pointer tracks the end of the merged array. We compare the 
values at the first and second pointer and insert the larger value at the third pointer. 
"""

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        p1 = m-1
        p2 = n-1
        p3 = m+n-1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 -= 1
            else:
                nums1[p3] = nums2[p2]
                p2-= 1
            p3-=1

        while p2 >= 0:
            nums1[p3] = nums2[p2]
            p2 -=1
            p3 -=1