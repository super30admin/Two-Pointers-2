# Time Complexity : O(N)
# Space Complexity : O(1)  
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am using three pointers, i, j, and k. The i pointer starts from the end of the initialized part from given nums1 array,
# the j pointer starts from the end of nums2, and the k pointer starts from the end of nums1 array.
# I compare the elements at i and j, and place the larger one at position k in nums1.
# I then move the corresponding pointer (i or j) and k one step back.

from typing import List
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        i = m - 1
        j = n - 1
        k = m + n - 1
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
                k -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
                k -= 1
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1

        