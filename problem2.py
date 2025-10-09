# Time Complexity : O(m + n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Approach:
# We merge the two sorted arrays starting from the end.
# Compare the largest elements and place the larger one at the back of nums1.
# If nums2 still has remaining elements, copy them to the front of nums1.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        last = m + n - 1     # Index for the last position in nums1
        
        # Compare elements from the end of both arrays
        while m > 0 and n > 0:
            # If last element of nums1 is greater, place it at 'last' position
            if nums1[m - 1] > nums2[n - 1]:
                nums1[last] = nums1[m - 1]
                m -= 1
            else:
                # Otherwise, place nums2's element at 'last' position
                nums1[last] = nums2[n - 1]
                n -= 1
            last -= 1  # Move to next position from the back

        # If nums2 still has elements left, copy them all to nums1
        while n > 0:
            nums1[last] = nums2[n - 1]
            n, last = n - 1, last - 1  # Move both pointers left

        # No return needed since we modify nums1 in place
