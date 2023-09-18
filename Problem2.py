# TC: O(n+m)
# SC: O(1)
class Solution:
    def merge(self, nums1, m, nums2, n) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        m1, n1, i = m-1, n-1, m+n-1
        while i >= 0:
            if n1 < 0:
                break
            elif m1 >=0 and nums1[m1] > nums2[n1]:
                nums1[i] = nums1[m1]
                m1 -= 1
            else:
                nums1[i] = nums2[n1]
                n1 -= 1
            i -= 1

        