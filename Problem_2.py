"""
Problem : 2

Time Complexity : O(m+n)
Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

creating two pointers pointing to the end of the given two arrays
comparing the maximum number from the end and adding that number to the end
of the bigger list and repeating the process until both the counters approach 0

"""

# Merge Sorted Array

class Solution(object):
    def merge(self, nums1, m, nums2, n):

        p1=m-1
        p2=n-1
        idx=m+n-1

        while p1>=0 and p2>=0:
            if nums1[p1]>=nums2[p2]:
                nums1[idx]=nums1[p1]
                p1-=1
            else:
                nums1[idx]=nums2[p2]
                p2-=1
            idx-=1

        while p2>=0:
            nums1[idx]=nums2[p2]
            p2-=1
            idx-=1