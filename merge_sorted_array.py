# # Time Complexity: O(m + n)
# Space Complexity: O(1)
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        #         start two pointers from end of the respective arrays
        pointer1 = m - 1
        pointer2 = n - 1
        #         mainataining one pointer at the end of (m + n) array length
        p = (m + n) - 1

        #         Iterating over arrays till both pointers are greater than or equal to 0
        while pointer1 >= 0 and pointer2 >= 0:
            #         if pointer 1 value > pointer 2  or less than each other update greater value at the end of the 1st array and update the pointer accordingly
            if nums1[pointer1] > nums2[pointer2]:
                nums1[p] = nums1[pointer1]
                p -= 1
                pointer1 -= 1
            else:
                nums1[p] = nums2[pointer2]
                p -= 1
                pointer2 -= 1
        #         checking i fis there any elements left in 2nd array if so will just add in the 1st array
        while pointer2 >= 0:
            nums1[p] = nums2[pointer2]
            p -= 1
            pointer2 -= 1

        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
