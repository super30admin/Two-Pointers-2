"""
Approach

1. since we have enough space in array1 we can start inserting the reslut from the end of array1 to avoid any over-writings
2. we start form the end of the array and compare the ends of both array and takes out the bigger element and put it in end of array1

"""


# Time Complexity : O (m+n) where m and n are the lengths of given arrays
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        l1=m-1
        l2=n-1
        k = (m+n)-1
        
        while(l2>=0 and l1>=0):
            if nums2[l2]>=nums1[l1]:
                nums1[k]=nums2[l2]
                k-=1
                l2-=1
            else:
                nums1[k]=nums1[l1]
                k-=1
                l1-=1
        while l1>=0:
            nums1[k]=nums1[l1]
            k-=1
            l1-=1
        while l2>=0:
            nums1[k]=nums2[l2]
            k-=1
            l2-=1
        
        return nums1 