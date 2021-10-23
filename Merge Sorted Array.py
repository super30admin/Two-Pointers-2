# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(n + n)
# Space Complexity: O(1)
# Logic: initialize p1 & p2 to the end elements of array & start sorting from end until one of them gets exhausted. If
# p2 gets exhausted remaining nums1 is already sorted, if p1 gets exhausted there are chances p2 is not exhausted so run
# a loop for remaining p2 to be added in nums1.

class Solution:
    def merge(self, nums1, m: int, nums2, n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        k = len(nums1) - 1
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[k] = nums1[p1]
                p1 -= 1
            else:
                nums1[k] = nums2[p2]
                p2 -= 1
            k -= 1
        while p2 >= 0:
            nums1[k] = nums2[p2]
            p2 -= 1
            k -= 1


sol = Solution()
sol.merge([2,0],
1,
[1],
1)