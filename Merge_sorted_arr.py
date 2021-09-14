# Time Complexity: O(n)
# Space Complexity: O(1)
# Approach to solve the problem:
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        last = m + n - 1
        while m > 0 and n > 0:                          # Termination state
            if nums1[m - 1] > nums2[n - 1]:             # From last if nums1 last is greater than nums2
                nums1[last] = nums1[m - 1]              # Replacing last with nums1 m - 1
                m -= 1
            else:
                nums1[last] = nums2[n - 1]
                n -= 1
            last -= 1
        while n > 0:                                    # Termination state
            nums1[last] = nums2[n - 1]
            n, last = n - 1, last - 1