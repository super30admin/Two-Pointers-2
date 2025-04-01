# Merges nums2 into nums1 in-place,nums1 has enough space (size m+n). Uses a two-pointer approach from the end of both arrays.
# TC: O(m + n)  Iterates through both lists once
# SC: O(1)  Modifies nums1 in-place without extra space

from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        # Pointer to the last index of the merged array
        last = m + n - 1

        # Merge from the end, comparing the largest elements first
        while m > 0 and n > 0:
            if nums1[m - 1] >= nums2[n - 1]:  # Take the larger element
                nums1[last] = nums1[m - 1]
                m -= 1  # Move pointer in nums1
            else:
                nums1[last] = nums2[n - 1]
                n -= 1  # Move pointer in nums2
            last -= 1  # Move the merged array pointer

        # If nums2 still has remaining elements, copy them
        while n > 0:
            nums1[last] = nums2[n - 1]
            n -= 1
            last -= 1


nums1 = [1, 2, 3, 0, 0, 0]
m = 3
nums2 = [2, 5, 6]
n = 3

sol = Solution()
sol.merge(nums1, m, nums2, n)
print(nums1)  # Output: [1, 2, 2, 3, 5, 6]
