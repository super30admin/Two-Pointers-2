# // Time Complexity :O(m+n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :yes
# // Three line explanation of solution in plain english: we use three pointers, p1, p2 set to the last elements of nums1 and nums2
# idx pointer is set to the end of the complete array nums1. We then compare the last elements of both the arrays and place the greater 
# element at the idx pointer, then decrement the pointers by 1

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1=m-1
        p2=n-1
        idx=m+n-1
        while p1>=0 and p2>=0:
            if nums1[p1]<nums2[p2]:
                nums1[idx]=nums2[p2]
                p2-=1
                idx-=1
            else:
                nums1[idx]=nums1[p1]
                p1-=1
                idx-=1
                
        while p2>=0:
            nums1[idx]=nums2[p2]
            p2-=1
            idx-=1