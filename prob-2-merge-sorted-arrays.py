class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Time complexity: O(n+m)
        Space complexity: O(m) - bigger array
        Solution: We will use the 3-pointers solution from the beginning to solve this
        Did this code successfully run on Leetcode: Yes
        Any problem you faced while coding this: No
        """

        nums1_copy = nums1[:m]

        p1 = 0 # pointer for nums1_copy
        p2 = 0 # pointer for nums2

        # Compare elements from nums1_copy and nums2 
        # Copy smallest to num1
        for p in range(m+n):
            # Check that p1 and p2 do not cross the boundaries
            if (p2 >= n) or (p1 < m and nums1_copy[p1] < nums2[p2]):
                 nums1[p] = nums1_copy[p1]
                 p1 += 1
            else:
                nums1[p] = nums2[p2]
                p2 += 1



        
