# time: O(m+n)
# space: O(1)
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        right1 = m -1
        right2 = n - 1
        overall = m + n - 1
        while right1 >= 0 and right2 >= 0:
            if nums1[right1] > nums2[right2]:
                nums1[overall] = nums1[right1]
                right1 -= 1
                overall -= 1
            else:
                nums1[overall] = nums2[right2]
                right2 -= 1
                overall -= 1
        while right2 >= 0:
            nums1[overall] = nums2[right2]
            right2 -= 1
            overall -= 1
        