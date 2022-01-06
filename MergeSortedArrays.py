
# Time Complexity : O(n + m) where n is len of nums1 and m is len of nums2
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''There is empty space at the end. Start filling in the sorted array from the back. 
Why does this not overwrite? Because there is exactly m + n space in nums1. 
Even if we use all the elements from nums2 first we can never overwrite.'''

# Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i1 = m - 1
        i2 = n - 1
        idx = len(nums1) - 1
        
        while i1 > -1 and i2 > -1:
            if nums1[i1] > nums2[i2]:
                nums1[idx] = nums1[i1]
                i1 -= 1
            else:
                nums1[idx] = nums2[i2]
                i2 -= 1
            
            idx -= 1
        
        while i1 > -1:
            nums1[idx] = nums1[i1]
            i1 -= 1
            idx -= 1
        
        while i2 > -1:
            nums1[idx] = nums2[i2]
            i2 -= 1
            idx -= 1
            