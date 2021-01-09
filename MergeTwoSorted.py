'''
    Time Complexity:
        O(m+n) (where m = length of the first array and n = length of the second)

    Space Complexity:
        O(1)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Start from the end of the two lists.
        Keep a pointer to record the current position of the index in the sorted reult as well.
        This starts from the end.
        Keep two pointers to record their positions
        Copy the bigger element over to the finally sorted index, and move the pointer of the bigger element inwards towards 0.
        If the second list (smaller list) hasn't reached the end, copy its elements too.
'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        end = m + n - 1
        l1_end = m - 1
        l2_end = n - 1

        while l1_end >= 0 and l2_end >= 0:
            if nums1[l1_end] > nums2[l2_end]:
                nums1[end] = nums1[l1_end]
                l1_end -= 1
            else:
                nums1[end] = nums2[l2_end]
                l2_end -= 1
            end -= 1

        while l2_end >= 0:
            nums1[l2_end] = nums2[l2_end]
            l2_end -= 1
