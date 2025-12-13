# Time Complexity : O(m+n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
#Start from the ends of both arrays and compare the largest remaining elements.
# Place the larger value at the end of nums1 and move the corresponding pointer backward.
# After one array is exhausted, copy any leftover elements from nums2 into nums1 since they are already sorted.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m-1
        j = n-1
        k = m+n-1
        while i >=0 and j >=0:
            if nums2[j]>nums1[i]:
                nums1[k] =nums2[j]
                j -= 1
            else:
                nums1[k] = nums1[i]
                i -= 1
            k -= 1
        while j >=0:
            nums1[k] = nums2[j]
            k -= 1
            j -= 1