class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i1 = m - 1
        i2 = n - 1
        pt = m + n - 1
        while i2 >= 0 and i1 >= 0:
            if nums1[i1] < nums2[i2]:
                nums1[pt] = nums2[i2]
                i2 -= 1
                pt -= 1
            else:
                nums1[pt] = nums1[i1]
                i1 -= 1
                pt -= 1

        if i2 >= 0:
            while i2 >= 0:
                nums1[pt] = nums2[i2]
                i2 -= 1
                pt -= 1
        if i1 >= 0:
            while i1 >= 0:
                nums1[pt] = nums1[i1]
                i1 -= 1
                pt -= 1

        return
