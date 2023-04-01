class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
      
        p1 = m - 1
        p2 = n - 1
        for p in range(m + n - 1, -1, -1):
            if p1 >=0 and p2 >= 0 and nums1[p1] >= nums2[p2]:
                nums1[p] = nums1[p1]
                p1 -= 1
            elif p2 >= 0:
                nums1[p] = nums2[p2]
                p2 -= 1
        return nums1