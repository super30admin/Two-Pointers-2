class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        Merges two sorted arrays nums1 and nums2 into nums1 in-place.
        Time complexity: O(m + n), where m is the length of nums1 and n is the length of nums2.
        Space complexity: O(1).
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None
        """
        m1 = m - 1  # Pointer for the last element in nums1
        n1 = n - 1  # Pointer for the last element in nums2

        # Iterate over nums1 and nums2 starting from the end and merge the elements in nums1 in descending order
        for p in range(n + m - 1, -1, -1):
            # Break the loop if all elements from nums2 have been merged into nums1
            if n1 < 0:
                break

            # Compare the current elements from nums1 and nums2 and place the larger element in nums1[p]
            if m1 >= 0 and nums1[m1] > nums2[n1]:
                nums1[p] = nums1[m1]
                m1 -= 1
            else:
                nums1[p] = nums2[n1]
                n1 -= 1
