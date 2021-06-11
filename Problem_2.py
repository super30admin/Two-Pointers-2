from typing import List
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> List[int]:
        i = m - 1
        j = n - 1
        right = m + n - 1
        while i>=0 and j>=0:
            if nums1[i] > nums2[j]:
                nums1[right] = nums1[i]
                i -= 1
            else:
                nums1[right] = nums2[j]
                j -= 1
            right -= 1

        while j >= 0:
            nums1[right] = nums2[j]
            j -= 1
            right -= 1
        return nums1

obj = Solution()
print(obj.merge([1,2,3,0,0,0], 3, [2,5,6], 3))
print(obj.merge([1], 1, [], 0))
print(obj.merge([0], 0, [1], 1))

# Time Complexity : O(m + n)
# Space Complexity : O(1)

        