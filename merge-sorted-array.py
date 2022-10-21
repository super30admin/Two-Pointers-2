# TC: O(m+n)
# SC: O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #Here we are gonna use 3 pointer, 
#         1. is gonna point towards the end of length of the arr1
#         2. is gonna point towards the last element of arr1
#         3. is gonna point towards the last element of arr2
        
        
        p1=m-1
        p2=n-1
        
        p=m+n-1
        
        while p1>=0 and p2>=0:
            if nums1[p1]>nums2[p2]:
                nums1[p]=nums1[p1]
                p1-=1
            else:
                nums1[p]=nums2[p2]
                p2-=1
            p-=1
            
        while p2>=0:
            nums1[p]=nums2[p2]
            p2-=1
            p-=1
                
            