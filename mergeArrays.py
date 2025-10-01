"""
We start filling nums1 from the back using two pointers from end of nums1's filled part and nums2.
At each step, we place the larger of the two elements at the end and move pointers backward.
After that, if anything is left in nums2, we copy it directly into nums1.

"""
#Time Complexity:
#Space Complexity:

class Solution:
    def merge(self, nums1, m, nums2, n):
        p1, p2 = m - 1, n - 1
        idx = m + n - 1

        while p1 >= 0 and p2 >= 0:
            if nums2[p2] > nums1[p1]:
                nums1[idx] = nums2[p2]
                p2 -= 1
            else:
                nums1[idx] = nums1[p1]
                p1 -= 1
            idx -= 1

        while p2 >= 0:
            nums1[idx] = nums2[p2]
            p2 -= 1
            idx -= 1