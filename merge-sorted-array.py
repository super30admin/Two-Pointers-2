# Problem: merge-sorted-array

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
    # 2 pointers, each one beginning at m-1 & n-1 resp
    # while pointer 1 >= 0 & pointer 2 >= 0, compare, add the higher one at the end of the first array
    # if array 2 still has elements left, add them all sequentially
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p_1, p_2 = m-1, n-1

        ind = m + n - 1

        while p_1 >=0 and p_2 >= 0:
            if nums1[p_1] >= nums2[p_2]:
                nums1[ind] = nums1[p_1]
                p_1 -= 1
            else: 
                nums1[ind] = nums2[p_2]
                p_2 -= 1
            ind -= 1
        while p_2 >=0:
            nums1[ind] = nums2[p_2]
            p_2 -= 1
            ind -= 1