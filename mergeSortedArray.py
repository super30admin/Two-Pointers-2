class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        # Iterator for nums1 without ZERO's
        ptrA = m-1
        
        # Iterator for nums2
        ptrB = n-1
        
        # Iterator for nums1 with ZERO
        itr = m+n-1
        
        # Compare the elements in num1 without ZERO's from back
        while ptrA>=0 and ptrB>=0:
            
            if nums1[ptrA] < nums2[ptrB]:
                nums1[itr] = nums2[ptrB]
                ptrB-=1
                
            elif nums1[ptrA] >= nums2[ptrB]:
                nums1[itr] = nums1[ptrA]
                ptrA-=1
            
            itr-=1
        
        # Case, if m=0 i.e. ptrA= -1
        while ptrA<0 and ptrB>=0:
            nums1[itr] = nums2[ptrB]
            ptrB-=1
            itr-=1