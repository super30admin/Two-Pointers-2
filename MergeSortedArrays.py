# time complexity: o(m+n)
# space complexity: o(1)
# ran on leetcode: yes


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        pointer_nums1 = m - 1
        pointer_nums2 = n - 1
        i = m + n - 1
        while pointer_nums1 >= 0 and pointer_nums2 >= 0:
            if nums1[pointer_nums1] > nums2[pointer_nums2]:
                nums1[i] = nums1[pointer_nums1]
                pointer_nums1 -= 1
            else:
                nums1[i] = nums2[pointer_nums2]
                pointer_nums2 -= 1

            i -= 1
        while (pointer_nums2 >= 0):
            nums1[i] = nums2[pointer_nums2]
            pointer_nums2 -= 1
            i -= 1