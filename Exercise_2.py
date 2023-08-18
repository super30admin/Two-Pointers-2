# ## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

# // Time Complexity :O(m + n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        # creating 3 ptrs
        p1 = m - 1
        p2 = n - 1
        idx = m + n - 1
        # iterating over the 2 arrays
        while (p1 >= 0 and p2 >= 0):
            # Finding the maximum and replacing it at end of nums1
            if nums1[p1] >= nums2[p2]:
                nums1[idx] = nums1[p1]
                p1 -= 1
            else:
                nums1[idx] = nums2[p2]
                p2 -= 1
            idx -= 1
        # if nums 2 left then adding it
        while p2 >= 0:
            nums1[idx] = nums2[p2]
            idx -= 1
            p2 -= 1
