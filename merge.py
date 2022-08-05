class Solution:#time O(m+n) space O(1)
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        p=len(nums1)-1
        m=m-1
        n=n-1
        while (m>=0 and n>=0):
            if nums1[m]>=nums2[n]:
                nums1[p]=nums1[m]
                m-=1
            else:
                nums1[p]=nums2[n]
                n-=1
            p-=1
        while n>=0:
            nums1[p]=nums2[n]
            p-=1
            n-=1
