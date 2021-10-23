"""
Time Complexity: O(m+n)
Space Complecity: O(1)
"""


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ptr1 = m - 1
        ptr2 = n - 1
        index = m + n - 1

        while (ptr1 >= 0 and ptr2 >= 0):
            if nums1[ptr1] >= nums2[ptr2]: # For equal elements, add elements from array 1 itself.
                nums1[index] = nums1[ptr1]
                ptr1 -= 1
            elif nums1[ptr1] < nums2[ptr2]:
                nums1[index] = nums2[ptr2]
                ptr2 -= 1
            index -= 1

        # if arr1 is traversed but arr2 elements still needs to be added
        while ptr2 >= 0:
            nums1[index] = nums2[ptr2]
            ptr2 -= 1
            index -= 1

