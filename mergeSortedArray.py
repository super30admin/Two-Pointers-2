# Time Complexity : O(m+n), where n is the len(nums1) and m is len(nums2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# Your code here along with comments explaining your approach
class Solution(object):
    # this problem will be solved using 3 pointers, 2 at m and n and the other at the end of resultant array.
    # for every element i and j, compare and place the biggest at k and move the pointers accordingly.
    # at the end make sure that both the arrays are scanned otherwise push all remaining elements.
    def merge(self, nums1, m, nums2, n):
        if not nums1 or not nums2:
            return

        i, j, k = m - 1, n - 1, m + n - 1

        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1
        # in case of remaining elements in nums2
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1
        # print nums1


Solution().merge([3, 6, 10, 0, 0, 0], 3, [1, 5, 9], 3)
