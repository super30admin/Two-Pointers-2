# Merge Sorted Array
#Time Complexity: O(m+n)
#Space Complexity: O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        
        for p in reversed(range(m+n)):
            if p2<0:
                break
            if p1>=0 and nums1[p1] > nums2[p2]:
                nums1[p] = nums1[p1]
                p1 -=1
            else:
                nums1[p] = nums2[p2]
                p2 -=1
        
        
