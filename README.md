# Two-Pointers-2

## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,1,2,2,3],


Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.


It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,1,2,3,3],


Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.


It doesn't matter what values are set beyond the returned length.
Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)

int len = removeDuplicates(nums);


// any modification to nums in your function would be known by the caller.

// using the length returned by your function, it prints the first len elements.

for (int i = 0; i < len; i++) {

    print(nums[i]);

}

## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are mand n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:

nums1 = [1,2,3,0,0,0], m = 3

nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]

## Problem3 (https://leetcode.com/problems/search-a-2d-matrix-ii/)
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
Example:

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.
