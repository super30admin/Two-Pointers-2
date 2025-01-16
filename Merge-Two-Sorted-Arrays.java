## Problem2 (https://leetcode.com/problems/merge-sorted-array/)
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of 
elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, 
nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 
and should be ignored. nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Approach 1: Bruteforce
In this we will merge nums2 in nums1 and then sort it
Time Complexity : O(n) + O(m+n(log(m+n)))
Space Complexity : O(1)

Approach 2:
We can use hashmap what we will do is we will store all the values of nums1 and nums2 in hashmap.
We will get the keySet of the map and then we will pass it to a list.
We will sort the list and then based on list we will get the count of the key which is stored as values from the map and add it an array
Time Complexity=O((m+n) log (m+n))
Space Complexity = O(m+n)

Approach 3:
In the approach we will keep 3 pointers
