'''https://leetcode.com/problems/merge-sorted-array/

'''

# Time Complexity : O(N+M)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def merge(self, nums1: 'list[int]', m: int, nums2: 'list[int]', n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        k = m+n-1
        
        while p1 >= 0 and p2 >= 0:
            if nums2[p2] >= nums1[p1]:
                nums1[k] = nums2[p2]
                k -= 1
                p2 -= 1
            else:
                nums1[k] = nums1[p1]
                k -= 1
                p1 -= 1
        
        while p2 >= 0:
            nums1[k] = nums2[p2]
            k -= 1
            p2 -= 1