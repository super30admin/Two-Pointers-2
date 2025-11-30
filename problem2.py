"""
We use two pointers from the end of the lists and maintain a last pointer as a third one to swap the elements greater than one at m and n position to the last
place of the nums1 array. The remaining elements, if any are placed in the last element as a loop
TC is o(m+n) and SC is o(!)"""


class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        last = m + n - 1
        while m > 0 and n > 0:
            if nums1[m - 1] > nums2[n - 1]:
                nums1[last] = nums1[m - 1]
                m -= 1
            else:
                nums1[last] = nums2[n - 1]
                n -= 1
            last -= 1

        #if there are still elements left in the nums 2 array
        while n > 0:
            nums1[last] = nums2[n-1]
            n -= 1
            last -= 1

        


        