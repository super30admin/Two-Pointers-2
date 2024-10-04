# 88. Merge Sorted Array
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        p1 = m-1
        p2 = len(nums2)-1
        idx = len(nums1)-1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] < nums2[p2]:
                nums1[idx] = nums2[p2]
                p2 -= 1
            else:
                nums1[idx] = nums1[p1]
                p1 -= 1
            idx -= 1

        while p2 >= 0:
            nums1[idx] = nums2[p2]
            p2 -= 1
            idx -= 1

        
        