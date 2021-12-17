class Solution:
    def merge(self, nums1, m: int, nums2, n: int) -> None:

        # Time Complexity = O(m+n)
        # Space Complexity = O(1)

        if nums1 is None or len(nums1) == 0:
            return

        # Assigning pointers to point at the (m-1)th and (n-1)th index
        ptr1 = m - 1
        ptr2 = n - 1
        # i is pointing towards the end of the first array
        i = m + n - 1

        while ptr1 >= 0 and ptr2 >= 0:
            if nums1[ptr1] > nums2[ptr2]:
                nums1[i] = nums1[ptr1]
                ptr1 -= 1
            else:
                nums1[i] = nums2[ptr2]
                ptr2 -= 1
            i -= 1

        # Checking only ptr2 is enough because nums1 elements are already sorted
        while ptr2 >= 0:
            nums1[i] = nums2[ptr2]
            ptr2 -= 1
            i -= 1
