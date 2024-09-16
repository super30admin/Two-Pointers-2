"""
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

"""
#Brutforce - merge nums1 and num2 and then use sort function , Time is O(nlogn), Space - Constant O(1)
def MergedSort1(nums1, m, nums2, n):
    nums1[m:]= nums2[:n]
    nums1.sort()
    return nums1

print(MergedSort1(nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 ))


"""
// time - 0(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

"""
#optimal
def MergedSort2(nums1, m, nums2, n):
    index=m+n-1      #index will be pointer at last element of merged array
    i=m-1            # pointer at end of 1st array
    j=n-1            # pointer at end of 2nd array
    while i >=0 and j >= 0:
        if nums1[i] > nums2[j]:              # start comparing elements at last position of both arreys and place the bigger
            nums1[index]=nums1[i]            # element at last position of merged array
            i -=1
        else:
            nums1[index] = nums2[j]
            j -=1
        index = index - 1
    while j >= 0:          # we left with elements in 2nd array then we add them into merged array 1 by 1.
        nums1[index]=nums2[j]
        j -=1
        index = index -1
    return nums1

print(MergedSort2(nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 ))



