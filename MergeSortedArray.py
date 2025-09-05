# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english : We start with comparing the larger numbers and replacing
# it with the larger number in the nums1 array at the end

# Your code here along with comments explaining your approach

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        p1 = m - 1
        p2 = n - 1
        idx = m + n - 1
        while (p1 >= 0 and p2 >= 0):
            if nums1[p1] > nums2[p2]:
                nums1[idx] = nums1[p1]
                p1 -= 1
            else:
                nums1[idx] = nums2[p2]
                p2 -= 1
            idx -= 1

        while (p2 >= 0):
            nums1[idx] = nums2[p2]
            p2 -= 1
            idx -= 1