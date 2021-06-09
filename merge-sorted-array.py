class Solution:
    def merge(self, nums1, m: int, nums2, n: int) -> None:
        # solving by two pointers
        p1 = m - 1
        p2 = n - 1
        for p in range(m + n - 1, -1, -1):
            if p2 < 0:
                break
            if (p1 >= 0 and nums1[p1] > nums2[p2]):
                nums1[p] = nums1[p1]
                p1 -= 1
            else:
                nums1[p] = nums2[p2]
                p2 -= 1













