# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES


# // Three line explanation of solution in plain english
# We have employed a three-pointer approach and each time we get a larger element we place it at the 3rd pointer


# // Your code here along with comments explaining your approach
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i, j, k = m-1, n-1, m+n-1

        while i >= 0 and j >= 0:
            if nums2[j] >= nums1[i]:
                nums1[k] = nums2[j]
                k -= 1
                j -= 1
            else:
                nums1[k] = nums1[i]
                k -= 1
                i -= 1
        #In-case nums2 is ignored
        if i < 0:
            while j >= 0:
                nums1[k] = nums2[j]
                k -= 1
                j -= 1
        