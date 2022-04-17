class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        if nums1==None and nums2==None:
            return 0
        r1=m-1
        r2=n-1
        r3=m+n-1
        while r1>=0 and r2>=0:
            if nums1[r1]>=nums2[r2]:
                nums1[r3]=nums1[r1]
                r1-=1
            else:
                nums1[r3]=nums2[r2]
                r2-=1
            r3-=1
        while r2>=0:
            nums1[r3]=nums2[r2]
            r2-=1
            r3-=1
        