# Time Complexity:O(m+n)
# Space Complexity: O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        p1 = m - 1
        p2 = n - 1
        high = (m + n) - 1
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] >= nums2[p2]:
                nums1[high] = nums1[p1]
                p1 -= 1
                high -= 1
            else:
                nums1[high] = nums2[p2]
                p2 -= 1
                high -= 1
        while p2 >= 0:
            nums1[high] = nums2[p2]
            p2 -= 1
            high -= 1

        """
        Do not return anything, modify nums1 in-place instead.
        """