# Time Complexity: O(n+m) where n and m is the length of the array 
# Space Complexity:  O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if len(nums2) > len(nums1):
            return self.merge(nums2,nums1)
        
        k = len(nums1) -1
        i = m-1
        j = n-1
        while(i>=0 and j>=0):
            if nums1[i] < nums2[j]:
                nums1[k] = nums2[j]
                k-=1
                j-=1
            # elif nums1[j]< nums2[k]:
            else:
                nums1[k] = nums1[i]
                k-=1
                i-=1
        while(j>=0):
            nums1[k] = nums2[j]
            j-=1
            k-=1
