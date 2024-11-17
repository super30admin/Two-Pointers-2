# TC: O(m+n)
# SC: O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        pt1 = m - 1
        pt2 = n - 1
        for i in range(m+n):
            if pt1 >= 0 and pt2 >= 0:
                if nums1[pt1] > nums2[pt2]:
                    nums1[m+n-1-i] = nums1[pt1]
                    pt1 -= 1
                else:
                    nums1[m+n-1-i] = nums2[pt2]
                    pt2 -= 1
            else:
                for i in range(pt2, -1, -1):
                    nums1[i] = nums2[i]
                break
