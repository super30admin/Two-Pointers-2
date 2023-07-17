#Time Complexity :O(m+n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
# use 2 pointers, both pointing to the last of 2 arrays. P1 points at the last element of nums1(m-1) and p2 at n-1. Compare values at both the P1 and P2. Insert the max value at the last position of nums1 and decrement that pointer and reapeat the same for all the elements.
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        P1=m-1
        P2=n-1
        Id=m+n-1
        while P1>=0 and P2>=0:
            if nums1[P1]>nums2[P2]:
                nums1[Id]=nums1[P1]
                P1-=1
            else:
                nums1[Id]=nums2[P2]
                P2-=1
            Id-=1
        while P2>=0:
            nums1[Id]=nums2[P2]
            P2-=1
            Id-=1
