# Merge Sorted Array

# Time Complexity : O(M+N)
# Space Complexity : O(1) as no extra space is used.
# Did this code successfully run on Leetcode : Yes, Runtime: 32 ms and Memory Usage: 14.3 MB
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
# Approach
"""
Using two pointers p1 in nums1 and p2 in end of nums2 and i will be 
equal to length of m+n-1. Compare values at p1 and p2. Comparing values
of p1 and p2. 

"""
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if(nums1==None or len(nums1)==0): # Edge Cases
            return
        i=m+n-1
        p1=m-1
        p2=n-1
        while(p1>=0 and p2>=0):
            if(nums1[p1]>nums2[p2]): # Cases
                nums1[i]=nums1[p1]
                p1=p1-1
            else:
                nums1[i]=nums2[p2]
                p2=p2-1
            i=i-1
        while(p2>=0):
            nums1[i]=nums2[p2]
            p2=p2-1
            i=i-1