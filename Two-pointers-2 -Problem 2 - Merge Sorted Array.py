"""
S30 FAANMG Problem #37 {Easy}

88. Merge Sorted Array

Time Complexity : O(M+N)

Space Complexity : O(1)


Did this code successfully run on Leetcode : Yes
  

Here we have 3 pointers
p1 = m-1
p2 = n-1
idx = m+n-1

Till both the pointers p1 and p2 iterating till first elemey
we are comparing p1 and p2

if nums1[p1] >= nums2[p2] : then we will update the value at idx with p1 and decrement p1 and idx
  else we will update the value at idx with p2 and decrement p2 and idx

If the p2 pointer is not reached the first elemet when we will directly replace the value of p2  with idx till the end of the list



@name: Rahul Govindkumar_RN27JUL2022
"""

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        p1 = m-1
        p2 = n-1
        
        idx = m+n -1
        
        while( p1>=0 and p2>=0 ):
            
            if (nums1[p1] >= nums2[p2]):
                nums1[idx] = nums1[p1]
                p1 -=1
            else:
                nums1[idx] = nums2[p2]
                p2 -=1
            
            idx -= 1
            
        
        while(p2>=0):
            nums1[idx] = nums2[p2]
            p2 -=1
            idx -=1
            
            
        