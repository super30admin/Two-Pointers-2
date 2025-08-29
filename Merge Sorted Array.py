# Time Complexity : O(m + n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english: This code merges two sorted arrays nums1 and nums2 into nums1 in-place, assuming nums1 has enough extra space at the end to hold all elements. It uses three pointers: p1 starting at the end of the valid part of nums1, p2 at the end of nums2, and idx at the very end of nums1, filling the largest elements first. Once one array is exhausted, any remaining elements from nums2 are copied over, ensuring the final nums1 is fully sorted

# Your code here along with comments explaining your approach


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        #TC: O(m + n)   SC: O(1)
        p1, p2 = m - 1, n - 1
        idx = m + n - 1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[idx] = nums1[p1]
                p1 -= 1
            else:
                nums1[idx] = nums2[p2]
                p2 -= 1
            
            idx -= 1
        
        while p2 >= 0:
            nums1[idx] = nums2[p2]
            p2 -= 1
            idx -= 1

        return nums1 