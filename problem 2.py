# // Time Complexity :O(m+n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :YES
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # keeping ptr 1 at m-1 and ptr2 at n-1 and high at nums1 last position
        ptr1=m-1
        ptr2=n-1
        high=m+n-1
        # move pointer until any one of the array is comppletely checked
        while ptr1>=0 and ptr2>=0:
            # if first array value at pt1 is small move element of nums2 at ptr2 to nums1 at high
            if nums1[ptr1]<nums2[ptr2]:
                nums1[high]=nums2[ptr2]
                ptr2-=1
            else:
                #move ptr1 element of nums1 to high position in nums1
                nums1[high]=nums1[ptr1]
                ptr1-=1
            high-=1
        
        # if some elements are left in ptr 2 just replace them in nums1 at high psoition and decrement high
        while(ptr2>=0):
            nums1[high]=nums2[ptr2]
            ptr2-=1
            high-=1
                