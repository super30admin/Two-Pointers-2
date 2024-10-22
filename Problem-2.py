'''
    Time Complexity: O(m+n)
    Space Complexity: O(1)
'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        pt1, pt2 = m-1, n-1
        idx = m+n-1

        while pt1 >= 0 and pt2 >= 0:
            if nums1[pt1] >= nums2[pt2]:
                nums1[idx] = nums1[pt1]
                idx -= 1
                pt1 -= 1
            elif nums2[pt2] >= nums1[pt1]:
                nums1[idx] = nums2[pt2]
                idx -= 1
                pt2 -= 1

        while pt1 >= 0:
            nums1[idx] = nums1[pt1]
            idx -= 1
            pt1 -= 1

        while pt2 >= 0:
            nums1[idx] = nums2[pt2]
            idx -= 1
            pt2 -= 1
        
        