## Problem2 (https://leetcode.com/problems/merge-sorted-array/)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if len(nums1)==0 or nums1==[]:
            return nums1
        p1 = m-1
        p2 = n-1
        a = m+n-1
        while p2>=0 and p1>=0:
            if nums2[p2]<nums1[p1]:
                nums1[a] = nums1[p1]
                p1=p1-1
            else:
                nums1[a] = nums2[p2]
                p2=p2-1
            a = a-1
        while p2>=0:
            nums1[a] = nums2[p2]
            p2=p2-1
            a=a-1
    
    #Time Complexity: O(n)
    #Space Complexity: O(1)
    #Approach: Two pointers ->Compare and decrement the pointer whose value is going to be copied and run the loop for all the elements. The second while loop is for the case when we might have all the nums2 array too just have one element repeating. [duplicates]
                
        