# TC : O(m+n)
# SC : O(1)
# Approach : We set m and n to len of arrays-1 and i to m+n-1. We compare p1 and p2 nums and copy greater
# element at i, and decrement corresponding pointers.
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if not nums1 or len(nums1) == 0:
            return
        i = m + n - 1; p1 = m -1; p2 = n - 1
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[i] = nums1[p1]
                p1 -= 1
            else:
                nums1[i] = nums2[p2]
                p2 -= 1
            i -= 1
        
        while p2 >= 0: # If there are elements left in nums2, they must be smallest ones
            nums1[i] = nums2[p2]
            i -= 1
            p2 -= 1