class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        a = m-1
        b = n-1
        
        for i in range (n+m-1,-1,-1):
            if b <0:
                break
            if a>=0 and nums1[a]>nums2[b]:
                nums1[i] = nums1[a]
                a -=1
            else:
                nums1[i] = nums2[b]
                b-=1
