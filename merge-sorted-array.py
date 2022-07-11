"""
Runtime Complexity:
O(m+n) - 'm' elements in nums1 array and 'n' elements in nums2 array. Adding nums2 to nums1 and sort them. Therefore m+n elements in the result nums1 array.
Space Complexity:
O(1) - constant time because we did not use any extra space to compute the solution.
Yes, the code worked on leetcode.
The idea behind the algorithm is to use 3 pointers, p1 at the end of list 1 and p2 at end of list 2 and another pointer p3 at the index m+n-1. We traverse and compare the elements and decrement the pointers wisely to return 
our result nums1 array.
"""


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if len(nums1)==0:
            return 
        p1 = m-1
        p2 = n-1
        p3 = m+n-1
        
        while p2>=0:
            if p1>=0 and nums1[p1]>nums2[p2]:
                nums1[p3] = nums1[p1]
                p1-=1
            else:
                nums1[p3] = nums2[p2]
                p2-=1
            p3-=1