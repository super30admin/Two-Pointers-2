'''
## Problem 88: Merge sorted array

## Author: Neha Doiphode
## Date:   07-12-2022

## Description:
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
    and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    The final sorted array should not be returned by the function,
    but instead be stored inside the array nums1.
    To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
    and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

## Examples:
    Example 1:
        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

    Example 2:
        Input: nums1 = [1], m = 1, nums2 = [], n = 0
        Output: [1]
        Explanation: The arrays we are merging are [1] and [].
        The result of the merge is [1].

    Example 3:
        Input: nums1 = [0], m = 0, nums2 = [1], n = 1
        Output: [1]
        Explanation: The arrays we are merging are [] and [1].
        The result of the merge is [1].
        Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

## Constraints:
    nums1.length == m + n
    nums2.length == n
    0 <= m, n <= 200
    1 <= m + n <= 200
    -109 <= nums1[i], nums2[j] <= 109

## Time complexity: O(m + n), we traverse both arrays once.

## Space complexity: O(1), we sort in-place.

'''

from typing import List

def get_input():
    print("Enter array 1 (with spaces): ", end = "")
    inp_list1 = input()
    inp_list1 = [int(value) for value in inp_list1.split()]

    print("Enter array 2 (with spaces): ", end = "")
    inp_list2 = input()
    inp_list2 = [int(value) for value in inp_list2.split()]

    return inp_list1, inp_list2

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if not len(nums1):
            return

        p1 = m - 1
        p2 = n - 1
        p3 = m + n - 1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p1], nums1[p3] = nums1[p3], nums1[p1]
                p1 -= 1
            else:
                nums2[p2], nums1[p3] = nums1[p3], nums2[p2]
                p2 -= 1
            p3 -= 1

        # Edge case: nums1 = [0], m = 0 nums2 = [1], n = 1
        #            nums1 = [2, 0], m = 1 nums2 = [1], n = 1
        while p2 >= 0:
            nums1[p3] = nums2[p2]
            p2 -= 1
            p3 -= 1

# Driver code
solution = Solution()
inp_array1, inp_array2 = get_input()
print(f"Input array 1: {inp_array1}")
print(f"Input array 2: {inp_array2}")
solution.merge(inp_array1, inp_array2)
print(f"Merged array: {inp_array1}")
