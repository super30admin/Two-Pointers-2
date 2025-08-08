# Placing two pointers at the end of nums1[m-1] and nums2[n-1], comparing elements and placing the larger one at the end of nums1
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        while m>0 and n>0:
            if nums1[m-1]>nums2[n-1]:
                nums1[m+n-1] = nums1[m-1]
                m-=1
            else:
                nums1[m+n-1] = nums2[n-1]
                n-=1
        if n: # If there are remaining elements in nums2, copy them
            nums1[:n] = nums2[:n]

        