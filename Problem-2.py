class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        if n==0 or not nums1 or not nums2:
            return 
        idx=len(nums1)-1
        i=len(nums1)-n-1
        j=len(nums2)-1
        
        while j>=0 and i>=0:
            if nums2[j]>=nums1[i]:
                nums1[idx]=nums2[j]
                idx-=1
                j-=1
            else:
                nums1[idx]=nums1[i]
                idx-=1
                i-=1
                
        while j>=0:
            nums1[idx]=nums2[j]
            j-=1
            idx-=1
            