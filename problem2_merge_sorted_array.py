# // Time Complexity : O(m+n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        p1, p2, insert = m-1, n-1, m+n-1
        
        while(p1>=0 and p2>=0):
            if(nums1[p1] >= nums2[p2]):
                nums1[insert] = nums1[p1]
                p1 -= 1
            else:
                nums1[insert] = nums2[p2]
                p2 -= 1
            insert -= 1
        
        while(p1>=0):
            nums1[insert] = nums1[p1]
            p1 -= 1
            insert -= 1
        while(p2>=0):
            nums1[insert] = nums2[p2]
            p2 -= 1
            insert -= 1