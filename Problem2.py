# Time Complexity : O(n) where n is the length of nums2
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def merge(self, nums1, m, nums2, n):

        while m > 0 and n > 0:
            if nums1[m - 1] > nums2[n - 1]:
                nums1[m + n - 1] = nums1[m - 1]
                m -= 1
            else:
                nums1[m + n - 1] = nums2[n - 1]
                n -= 1

        while n > 0:
            nums1[m + n - 1] = nums2[n - 1]
            n -= 1


# Here i will loop till we have reached at the start of any of the list. Inside, we will check, if the number in nums1 is greater than
#the number in nums2 then we will copy that number of nums1 at the end of nums1 and decrease m by 1. Similarly, if the number in nums2
# is greater than the number in nums1 then then we will insert that number at the index in nums1 from last where the last number was inserted.
#at last, we will check if nums2 is still not empty then we will copy its elements in nums1