# Time Complexity :O(m+n)
# Space Complexity :O(1)
# Leet Code: Yes

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        j = m+n-1
        i1 = m-1
        i2 = n-1

        while j >= 0:
          if nums1[i1] > nums2[i2]:
            nums1[j] = nums2[i2]
            i2 -= 1
          elif nums1[i1] <= nums2[i2]:
            nums1[j] = nums1[i1]
            i1 -= 1
          j -= 1