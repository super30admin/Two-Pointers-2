# Time Complexity : O(m + n), where m is the number of elements in nums1 and n is in nums2
# Space Complexity : O(1), in-place merge without using any extra space
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        
        # In-place Two-Pointer Approach (from the end)
        p1 = m - 1 # Pointer to end of initialized part in nums1
        p2 = n - 1 # Pointer to end of nums2
        p = m + n - 1 # Pointer to end of nums1 (full length)

        # Merge from back to front
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p] = nums1[p1]
                p1 -= 1
            else:
                nums1[p] = nums2[p2]
                p2 -= 1
            p -= 1

        # If nums2 still has elements, copy them
        while p2 >= 0:
            nums1[p] = nums2[p2]
            p2 -= 1
            p -= 1

#--------------------------------------------------------------------------------

        # Sorting Approach (Time: O((m + n) log(m + n)), Space: O(m + n))
        
        # combined = nums1[:m] + nums2
        # combined.sort()

        # for i in range(m + n):
        #     nums1[i] = combined[i]

if __name__ == "__main__":
    sol = Solution()
    
    nums1 = [1, 2, 3, 0, 0, 0]
    m = 3
    nums2 = [2, 5, 6]
    n = 3
    sol.merge(nums1, m, nums2, n)
    print(nums1)  # Output: [1, 2, 2, 3, 5, 6]

    nums1 = [1]
    m = 1
    nums2 = []
    n = 0
    sol.merge(nums1, m, nums2, n)
    print(nums1)  # Output: [1]

    nums1 = [0]
    m = 0
    nums2 = [1]
    n = 1
    sol.merge(nums1, m, nums2, n)
    print(nums1)  # Output: [1]
