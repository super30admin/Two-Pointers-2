"""
Time Complexity : O(m+n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : none
"""

class Solution:
    def merge(self, nums1, m, nums2, n):
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        p1 = m - 1
        p2 = n - 1
        idx = m + n - 1
        
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[idx] = nums1[p1]
                p1 -= 1
            else:
                nums1[idx] = nums2[p2]
                p2 -= 1
            idx -= 1
            
        while p2 >= 0:
            nums1[idx] = nums2[p2]
            p2 -= 1
            idx -= 1
            
s = Solution()
nums1 = [4,5,8,0,0,0]
nums2 = [2,6,9]
s.merge(nums1, 3, nums2, 3)
print(nums1)