# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#coming from the last of the arrays will make the problem much more clearer and easy
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        i = m-1
        j = n-1
        k = m+n-1
        
        while k >= 0 and j >= 0 and i >= 0:
            if nums1[i] >= nums2[j]:
                nums1[k] = nums1[i]
                k -= 1
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
                k -= 1
        while k >=0 and j >=0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1
        # while k>=0 and i>=0:
        #     nums1[k] = nums1[i]
        #     k -= 1
        #     i -= 1
            
        