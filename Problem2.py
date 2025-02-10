# 88. Merge Sorted Array

# Time Complexity: O(n+m)
# Space Complexity: O(1)

# Approach:
# Use two pointers to merge the two arrays.
# Start from the end of the arrays and move the pointers inward.
# Compare the elements at the two pointers and move the larger element to the end of the array.
# Move the pointer of the array with the larger element inward.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        p1 = m-1
        p2 = n-1
        p = m+n-1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p] = nums1[p1]
                p1 -= 1
            else:
                nums1[p] = nums2[p2]
                p2 -= 1
            p -= 1  

        while p2 >= 0:
            nums1[p] = nums2[p2]
            p2 -= 1
            p -= 1
