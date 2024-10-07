# Time Complexity: O(m + n)
# Space Complexity: O(1) - We are modifying nums1 in place without using any extra space.
# 
# Approach:
# The goal is to merge two sorted arrays `nums1` and `nums2` in-place into `nums1`.
# `nums1` has enough space at the end to accommodate all elements of `nums2`.
# The approach involves iterating from the end of both `nums1` and `nums2` and placing the largest element at the current end of `nums1`.
# We continue this process while both arrays have elements, and if any elements remain in `nums2`, we place them in the remaining positions of `nums1`.
# We use two pointers `m` and `n` to track the last elements of `nums1` and `nums2` respectively, and merge in reverse order.

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        end = len(nums1) - 1  # Pointer to the last position of nums1

        # Merge in reverse order
        while m > 0 and n > 0:
            if nums1[m-1] > nums2[n-1]:
                nums1[end] = nums1[m-1]
                m -= 1
            else:
                nums1[end] = nums2[n-1]
                n -= 1
            end -= 1
        
        # If there are remaining elements in nums2, copy them
        while n > 0:
            nums1[end] = nums2[n-1]
            n -= 1
            end -= 1

        return nums1
