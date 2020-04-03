"""
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Trying to come with intuitve soln of
negative indexing

// Your code here along with comments explaining your approach
Algorithm Explanation
Iterate till i < nums1 length and j < nums2 length
BF:
if nums2 ele is greater than num1 ele, then move nums1 pointer
else:
    shift the elements in nums1 by 1 from m-1th position
    increment m by 1
    replace nums1 ele with nums2 ele
    iterate nums2 pointer
If there are elements in nums2, place them beginning 0 in nums1
Optimal - eliminating the shifting part, using the merge sort logic
Configuration - i = m -1, j = n-1,  target = m + n - 1
1. Use a target pointer to update the nums1 from num1 array and nums2 array
based on the greater element, since we are trying to place elements in order
2. If there are elements in nums2, place them from target position till all 
the elements in nums2 are placed in nums1
"""
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        #Brute Force solution
        i,j = 0,0
        print(nums1,nums2)
        if nums2: #if nums2 is empty we don't do anything
            while i < m and j < n:
                if nums2[j] > nums1[i]:
                    i+=1
                else:
                    #shift the elements in nums1 by one till the end of the array
                    k = m - 1
                    m+=1 #incrementing m since we are updating the list by one element from nums2
                    #Shifting the elements in nums2 starting from current m-1 index
                    while k >=i:
                        nums1[k+1] = nums1[k]
                        k-=1
                    #At this moment we just replace the nums1[i] by nums2[j]
                    nums1[i] = nums2[j]
                    j+=1
            while j < n:
                nums1[i] = nums2[j]
                i+=1
                j+=1
        
        
        i,j,target = m-1,n-1,m+n-1
        #PLacing the elements in order using target pointer (similar to merge sort, just here we go from behind)
        if nums2:
            while i >=0 and j >=0:
                if nums1[i] > nums2[j]:
                    nums1[target] = nums1[i]
                    i-=1
                else:
                    nums1[target] = nums2[j]
                    j-=1
                target-=1

            #checking the remaining elements of the nums2, need to move these elements in nums1 iteratively from ith pointer of nums1 to m+n-1
            while j >=0:
                nums1[target] = nums2[j]
                j-=1
                target-=1
