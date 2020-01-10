from typing import List


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        """
            https://leetcode.com/problems/merge-sorted-array/
            // Time Complexity : O(m+n)
                    'm' is the number of elements in the first array.
                    'n' is the number of elements in the second array
            // Space Complexity : O(1)
            // Did this code successfully run on Leetcode : Yes
            // Three line explanation of solution in plain english :
                - Two pointers each pointing to the last element in the sorted list
                - Traverse both the lists and copy the larger element
                - If any remaning elements from the second list, copy to the first list.
        """
        k, ptr1, ptr2 = m + n - 1, m - 1, n - 1
        while ptr1 >= 0 and ptr2 >= 0:
            # case 1
            # element at ptr1 is greater or equal
            if nums1[ptr1] >= nums2[ptr2]:
                nums1[k] = nums1[ptr1]
                ptr1 -= 1
            # case 2
            # element at ptr2 is greater
            else:
                nums1[k] = nums2[ptr2]
                ptr2 -= 1
            k -= 1

        # copy the remaining elements from nums2
        while ptr2 >= 0:
            nums1[k] = nums2[ptr2]
            k -= 1
            ptr2 -= 1


if __name__ == '__main__':
    h = Solution()
    nums1 = [1, 2, 3, 0, 0, 0]
    nums2 = [2, 5, 6]
    h.merge(nums1, 3, nums2, 3)
    print(nums1)
