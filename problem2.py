'''
Time Complexity :O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation: Choose 2 pointers one for the first array and second array find the max of the elements at 2 pointers and
insert the greater at the end of the array. Keep doing this until the pointers are >=0. Incase there are few elements
missing after this loop (check by seeing if pointer >=0), you add those elements to the array.
'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        i = m - 1
        j = n - 1
        k = len(nums1) - 1

        while i >= 0 and j >= 0:
            if nums2[j] > nums1[i]:
                nums1[k] = nums2[j]
                j -= 1
            else:
                nums1[k] = nums1[i]
                i -= 1
            k -= 1

        while j >= 0:
            nums1[k] = nums2[j]
            k -= 1
            j -= 1