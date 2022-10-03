# Time Complexity: O(m + n) where m and n are sizes of the two lists
# Space Complexity: O(1)

# The code successfully ran on leetcode

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m - 1 
        j = n - 1
        curr = m + n - 1
        
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[curr] = nums1[i]
                i -= 1
            
            else:
                nums1[curr] = nums2[j]
                j -= 1
            
            curr -= 1
            
        while j >= 0:
            nums1[curr] = nums2[j]
            j -= 1
            curr -= 1
                
            