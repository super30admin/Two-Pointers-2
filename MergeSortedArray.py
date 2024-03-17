# TC = O(m+n)
# SC = O(1)


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        idx1, idx2 = m - 1, n - 1
        r = len(nums1) - 1

        while idx1 >= 0 and idx2 >= 0:
            print(nums1[idx1] > nums2[idx2])
            if nums1[idx1] > nums2[idx2]:
                nums1[r] = nums1[idx1]
                idx1 -= 1

            else:
                nums1[r] = nums2[idx2]
                idx2 -= 1

            r -= 1

        while idx2 >= 0 and r >= 0:
            nums1[r] = nums2[idx2]
            idx2 -= 1
            r -= 1
