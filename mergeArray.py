# Time Complexity: O(M + N)

# Space Complexity: O(1)

# Using Two Pointer approach on this problem. I keep the pointers at the end of the arrays to find the largest element of the two.

# The intuition to keep pointer at the end is that the first array has empty space which can accommadate the 2nd array's elements.


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m - 1
        p2 = n - 1
        index = m + n - 1

        while(p1 >= 0 and p2 >= 0):
        
            if nums1[p1] >= nums2[p2]:
                nums1[index] = nums1[p1]
                p1 -= 1
                
            else:
                nums1[index] = nums2[p2]
                p2 -= 1
            index -= 1
        
        while p2 >= 0:
            nums1[index] = nums2[p2]
            p2 -= 1
            index -= 1
