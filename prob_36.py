# 88 leetcode
# time - O(N), space - O(1)
# start from last index of both arrays and compare and add nums2 to nums1 - sorting inplace.
class Solution:
    def merge(self, nums1, m, nums2, n) :
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #
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