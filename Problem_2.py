class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:

        #last index nums1
        last = m + n - 1

        #merge in rev order

        while m > 0 and n > 0:
            if nums1[m - 1] > nums2[n - 1]:
                nums1[last] = nums1[m - 1]
                m -= 1
            else:
                nums1[last] = nums2[n - 1]
                n -= 1
            last -= 1
        
        # fill if second array nums2 have extra remaing elements
        while n>0:
            nums1[last]  = nums2[n - 1]
            n, last = n - 1, last - 1
