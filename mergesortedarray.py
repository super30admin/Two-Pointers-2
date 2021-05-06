"""Merge Sorted Array
Time Complexity - O(n+m)
Space Complexity - O(1)
Approach -> use 3 pointers. start filling from the end of the arrays"""

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        """for i in range(0,n):
            #nums1[m+i]=nums2[i]
        #nums1.sort() #complexity -O((m+n)(log(m+n)))"""
        last = m+n-1
        while m>0 and n>0:
            if nums1[m-1]>nums2[n-1]:
                nums1[last]=nums1[m-1]
                m-=1
            else:
                nums1[last]=nums2[n-1]
                n-=1
            last-=1
        #fill nums1 with left over of nums2
        while n>0:
            nums1[last]=nums2[n-1]
            n-=1
            last-=1
            