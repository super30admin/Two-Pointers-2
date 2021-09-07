# Time Complexity : O(m+n)
# Space Complexity : O(m)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        copy_n1 = nums1[:m]
        ptr1,ptr2 = 0,0
        for p in range(m+n):
            if ptr2 >= n or (ptr1 < m and copy_n1[ptr1] <= nums2[ptr2]):
                nums1[p] = copy_n1[ptr1]
                ptr1+=1
            else:
                nums1[p] = nums2[ptr2]
                ptr2+=1
