class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        pt1 = m - 1
        pt2 = n - 1
        
        pt3 = (m+n) - 1
        
        print(pt1)
        print(pt2)
        print(pt3)
        
        while pt1 >= 0 and pt2 >= 0:
            
            if nums1[pt1] >= nums2[pt2]:
                nums1[pt3] = nums1[pt1]
                pt1 = pt1 - 1
                
            else:
                nums1[pt3] = nums2[pt2]
                pt2 = pt2 - 1
                
            pt3 = pt3 - 1
            
        while pt2 >= 0:
            nums1[pt3] = nums2[pt2]
            pt2 = pt2 - 1
            pt3 = pt3 - 1
                
        
