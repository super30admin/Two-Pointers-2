# The code merges nums2 into nums1 in-place, starting from the end, by comparing the largest elements and filling from the back 
# to avoid overwriting valid values. The two-pointer approach ensures efficient merging in O(m + n) time.

# Time Complexity: O(m + n) (Each element is processed once).
# Space Complexity: O(1) (In-place merge, no extra space used).
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        r1 = m - 1
        r2 = n - 1
        w = m + n - 1
        while r2 >= 0:
            if r1 >= 0 and nums1[r1] > nums2[r2]:
                    nums1[w] = nums1[r1]
                    r1 -= 1
            else:
                nums1[w] = nums2[r2]
                r2 -= 1
            w -= 1