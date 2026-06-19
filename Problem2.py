## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        
        Algorithm (Three Pointers from the end):
        - Since nums1 has enough space at the end to hold all elements from both arrays, 
          we can safely build the merged array from back to front without overwriting 
          any existing elements in nums1.
        - Set `p1` to point to the last initialized element in nums1 (m - 1).
        - Set `p2` to point to the last element in nums2 (n - 1).
        - Set `p3` to point to the very end of nums1 (m + n - 1), which is where we will 
          place the largest numbers.
        - Loop while both `p1` and `p2` are valid: compare elements at `p1` and `p2`, 
          place the larger one at `p3`, and move the respective pointers backward.
        - Finally, if there are any leftover elements in nums2, copy them over. 
          (Leftover elements in nums1 are already in their correct, sorted position).

        Time Complexity: O(m + n)
        - We iterate through the elements of nums1 and nums2 at most once. In the worst case,
          we make m + n operations to process all items.
          
        Space Complexity: O(1)
        - The algorithm operates strictly in-place. We only allocate three pointer variables 
          (p1, p2, p3) which require constant extra space, regardless of the array sizes.
        """
        p3 = m + n - 1
        p1 = m - 1
        p2 = n - 1

        while (p1 >= 0 and p2 >= 0):
            if nums1[p1] >= nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 -= 1
            else:
                nums1[p3] = nums2[p2]
                p2 -= 1
            p3 -= 1

        while p2 >= 0:
            nums1[p3] = nums2[p2]
            p2 -= 1
            p3 -= 1