# accepted in leetcode
# time - (N), space - O(1)
# started from last index of both arrays and comparing and adding nums2 to nums1 by sorting inplace.
class Solution:
    def merge(self, nums1, m: int, nums2, n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # print(nums1, nums2)
        while m > 0 and n > 0:
            if nums1[m-1] < nums2[n-1]:
                nums1[m+n-1]=nums2[n-1]
                n = n-1
            else:
                nums1[m+n-1]=nums1[m-1]
                m = m-1
        if m == 0:
            while n > 0:
                print(nums1[n-1])
                nums1[n-1] = nums2[n-1]
                n = n-1