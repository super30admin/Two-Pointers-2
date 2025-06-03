# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
    # have a slow at 1, counter = 1 
    # check next with fast pointer, if same, counter ++ - if not, counter = 1
    # if counter <= 2, nums[slow] = nums[fast] & move slow ++
    # reutrn slow for k

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 1
        counter = 1
        l = len(nums)
        for i in range(1, l):
            if nums[i] == nums[i-1]:
                counter += 1
            else:
                counter = 1
            if counter <= 2:
                nums[slow] = nums[i]
                slow += 1 
        return slow

## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
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
        

## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
    # we start at [1][n], and compare value with target. 
    # if target is smaller, move pointer to previous column
    # if target is greater, move pointer to next row
    # if value = target, return [][]
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:

        row, column = 0, len(matrix[0]) - 1

        while row < len(matrix) and column >=0:
            if matrix[row][column] == target:
                return True
            if matrix[row][column] > target:
                column -= 1
            if matrix[row][column] < target:
                row += 1

        return False
