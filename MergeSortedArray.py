class Solution:
    def merge(self, nums1, m: int, nums2, n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        left,right=m-1,n-1
        i=m+n-1
        while left>=0 and right>=0:
            if nums1[left]<=nums2[right]:
                nums1[i]=nums2[right]
                right-=1
            else:
                nums1[i]=nums1[left]
                left-=1
            i-=1
        for i in range(0,right+1):
            nums1[i]=nums2[i]
        
        
                