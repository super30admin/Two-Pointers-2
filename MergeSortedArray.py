# Time Complexity : O(m+n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# We are taking two pointers and one index pointer.We are comparing the elements of two arrays and putting the greater element at the end of the array. We are decrementing the index pointer and the pointer of the array which has the greater element. We are doing this until we reach the end of the array. If there are any elements left in the second array, we are putting them in the first array.

from typing import List
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        index = m+n-1
        p1 = m-1
        p2 = n-1
        while(p1>=0 and p2>=0):
            if nums1[p1]>nums2[p2]:
                nums1[index] = nums1[p1]
                p1 -= 1
            else:
                nums1[index] = nums2[p2]
                p2 -= 1
            index -= 1
        while(p2>=0):
            nums1[index] = nums2[p2]
            p2 -= 1
            index -= 1
