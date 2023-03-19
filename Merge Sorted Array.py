class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # Sorting Approach
        # Time: O(nlogn) where n = m + n
        # Space: O(1)
        # start = len(nums1) - len(nums2)
        # nums2iterator = 0
        # for i in range(start, len(nums1)):
        #     nums1[i] = nums2[nums2iterator]
        #     nums2iterator += 1
        # nums1.sort()

        # Optimised approach
        # Time : O(n + m)
        # Space: O(1)
        p1 = len(nums1) - len(nums2) - 1
        p2 = len(nums2) - 1
        occ = len(nums1 )- 1
        # print(nums1)
        # print(occ, p1, p2)
        while p1 >= 0 and p2 >= 0:
            # print(nums1)
            # print(occ, p1, p2)
            if nums1[p1] > nums2[p2]:
                nums1[occ] = nums1[p1]
                p1 -= 1
            elif nums2[p2] > nums1[p1]:
                nums1[occ] = nums2[p2]
                p2 -= 1
            else:
                nums1[occ] = nums1[p1]
                p1 -= 1
            occ -= 1

        if p1 < 0 and p2 >= 0:
            while occ >= 0:
                nums1[occ] = nums2[p2]
                occ -= 1
                p2 -= 1

        if p2 < 0 and p1 > 0:
            while occ >= 0:
                nums1[occ] = nums1[p1]
                occ -= 1
                p1 -= 1




