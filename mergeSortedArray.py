#Time Complexity: O((n+m)log(n+m))
#Space Complexity: O(n)
#Did it run on leetcode: Yes

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        for i in range(n):
            nums1[i + m] = nums2[i]
        
        # Sort nums1 list in-place.
        nums1.sort()