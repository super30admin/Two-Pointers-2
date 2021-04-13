class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        
        """
        if nums1 is None or len(nums1)==0:
            return 0
        pt1=m-1
        pt2=n-1
        index=m+n-1
        while(pt1>=0 and pt2>=0):
            if(nums1[pt1]>nums2[pt2]):
                nums1[index]=nums1[pt1]
                pt1-=1
            else:
                nums1[index]=nums2[pt2]
                pt2-=1
            index-=1
        
        while(pt2>=0):
            nums1[index]=nums2[pt2]
            pt2-=1
            index-=1
            
                
                
        