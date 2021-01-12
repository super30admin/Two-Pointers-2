# Time Complexity : O(n + m)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution(object):
    def merge(self, nums1, m, nums2, n)
    
        # Two pointers, insert from right to left
        p1 = m - 1
        p2 = n - 1
        for i in range(m + n - 1, -1, -1):
            if p1 >= 0 and (p2 < 0 or p2 >= 0 and nums1[p1] > nums2[p2]):
                nums1[i] = nums1[p1]
                p1 -= 1
            else:
                nums1[i] = nums2[p2]
                p2 -= 1
