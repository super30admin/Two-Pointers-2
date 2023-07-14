#Time: O(m+n)
# space: O(1)
#did the code run> yes
# issues faced: thought of approaching from start, realised traversing from end works.

# Approach:
# fill the nums1 from the end by comparing for the highest element
# track nums1 and nums2 elements using 2 pointers and track the filling of nums1 with another pointer
# traverse till nums1 or nums2 is done with.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1, p2, ptr = m-1, n-1, m+n-1
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[ptr] = nums1[p1]
                ptr -= 1; p1 -= 1
            else:
                nums1[ptr] = nums2[p2]
                ptr -= 1; p2 -= 1
        if p1 < 0:
            nums1[:ptr+1] = nums2[:p2+1]
        return
            