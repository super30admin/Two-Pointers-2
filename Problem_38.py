# TC: O(m + n)
# SC: O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr = m + n - 1
        ptr1, ptr2 = m - 1, n - 1

        while ptr >= 0:
            if ptr1 >= 0 and ptr2 >= 0 and nums1[ptr1] > nums2[ptr2]:
                nums1[ptr] = nums1[ptr1]
                ptr1 -= 1
            else:
                if ptr2 >= 0:
                    nums1[ptr] = nums2[ptr2]
                    ptr2 -= 1 
            ptr -= 1             


