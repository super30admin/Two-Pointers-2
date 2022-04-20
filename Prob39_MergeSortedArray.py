#Time Complexity : 0(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        for i in range (0, n):
            nums1.pop(m+i)
            nums1.insert(m+i,nums2[i])

        nums1.sort()
        