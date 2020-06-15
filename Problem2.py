from typing import List

"""

        Student :  Shahreen Shahjahan Psyche
        Time Complexity : O(N)
        Space Complexity : O(1)

"""

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        i = m - 1
        j = n - 1 
        k = m + n - 1
        
        # started at the end of the nums1's values which is m and nums2's 
        # values which is n. Now if nums1 current value is greater than nums2
        # current value, then swapping the current nums1 value to the last. else
        # otherwise
        while(i>=0 and j>=0):
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1
        
        # If all the nums1 values are shifted to the last and i is out of bound,
        # just transfering the values from nums2 at the beginning of the nums1
        while(j>=0):
            nums1[k] = nums2[j]
            j -= 1
            k -= 1