Time Complexity: O(n+m) n is the length of nums1 and m is the length of nums2
Space Complexity: O(1)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        l1 = m-1
        l2 = n-1
        idx = m+n-1
        while l1>=0 and l2>=0:
            if nums1[l1]>nums2[l2]:
                nums1[idx] = nums1[l1]
                l1 -= 1
            else:
                nums1[idx] = nums2[l2]
                l2 -= 1
            idx -= 1
        while l2>=0:
            nums1[idx] = nums2[l2]
            l2 -= 1
            idx -= 1
