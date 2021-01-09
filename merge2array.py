class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        Time Complexity: O(m+n)
        Space Complexity: O(1)
        """
        if(len(nums2)==0):
            return
        if(len(nums1)==0):
            for i in range(0,n):
                nums1[i] = nums2[i]
            return 
        
        i = m-1
        j = n-1
        k = m+n-1
        while(i>=0 and j>=0):
            if(nums1[i]>=nums2[j]):
                nums1[k] = nums1[i]
                i-=1
                k-=1
            else:
                nums1[k] = nums2[j]
                j-=1
                k-=1
        
        nums1[:j + 1] = nums2[:j+1]
