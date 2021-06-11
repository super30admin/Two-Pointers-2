class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        ptr1=m-1
        ptr2=m+n-1
        ptr3=n-1
        while ptr1>=0 and ptr3>=0:
            if nums1[ptr1]>nums2[ptr3]:
                nums1[ptr2]=nums1[ptr1]
                ptr1-=1
            else:
                nums1[ptr2]=nums2[ptr3]
                ptr3-=1
            ptr2-=1
        while ptr3>=0:
            nums1[ptr2]=nums2[ptr3]
            ptr3-=1
            ptr2-=1
            
"""Time complexity-O(m+n)
Space Complexity - O(1)"""


# for i in range(m,len(nums1)):
#             nums1[i]=nums2[i-m]
#         nums1.sort()
        
#         """Time complexity-O(nlog(m+n)) as we are appending the nums2 array into nums1 and then sorting the whole nums1 array
#         Space Complexity - O(1)"""
        
        