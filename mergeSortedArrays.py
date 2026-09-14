# Time Complexity : O(m+n), where m is the length of nums1 and n is the length of nums2
# Space Complexity : O(1)


class Solution:
    def merge(self, nums1, m, nums2, n):

        if nums1 is None or len(nums1) == 0:
            return

        # Initialize 3 pointers p1 - pointing to the last element of nums1,
        # p2 - last element of nums2 and p3 - pointing to the end of nums1(m+n)
        p1 = m - 1
        p2 = n - 1
        p3 = m + n - 1

        # Compare the value of every element in nums1 and nums2 and perform the required operation
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 = p1 - 1
            else:
                nums1[p3] = nums2[p2]
                p2 = p2 - 1
            p3 = p3 - 1

        # If any elements are left in nums2, we copy them to nums1c
        while p2 >= 0:
            nums1[p3] = nums2[p2]
            p2 = p2 - 1
            p3 = p3 - 1
