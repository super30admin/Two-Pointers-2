# Time: O(m+n)
# Space: O(1)

# The problem asks to merge two arrays which are sorted and should be sorted at the end the empty spaces are given where the nums2 elements should go
# Have 3 pointers starting from the end of m then n and the nums1 arr
# check which number is greater between last elements of num1 and num2 and add it at the end
# after this loop is done if there are elements present in num2 add them in the num1 array

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        pointer1 = m - 1
        idx = len(nums1) - 1
        pointer2 = n - 1

        while pointer1 >= 0 and pointer2 >= 0:
            if nums1[pointer1] > nums2[pointer2]:
                nums1[idx] = nums1[pointer1]
                pointer1 -= 1
            else:
                nums1[idx] = nums2[pointer2]
                pointer2 -= 1
            idx -= 1
        while pointer2 >= 0:
            nums1[idx] = nums2[pointer2]
            pointer2 -= 1
            idx -= 1