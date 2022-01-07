
# Two Pointer Solution

# // Time Complexity : O(M+N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach




class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        i = m-1
        j= n-1
        k = len(nums1) -1
        
        while i >= 0 and j >= 0:
            if nums1[i]> nums2[j]:
                nums1[k] = nums1[i]
                k -= 1
                i -= 1
            else:
                nums1[k] = nums2[j]
                k -= 1
                j -= 1
                
        while j >= 0:
            nums1[k] = nums2[j]
            k -=1
            j -=1
            