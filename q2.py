from typing import List

# Time Complexity : O(m+n), Where m,n are given input variables
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''
This solution is very similar to the merge step in the Mergesort, Except we are placing the pointer at the last element of the sorted arrays(or Lists) 
'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if(n==0):
            return
        #Here we use i,j as pointers pointing to index of last elements of the given sorted arrays
        i=m-1
        j=n-1
        #k is the index at which element is placed
        k=len(nums1)-1
        while(i>=0 and j>=0):
            if(nums1[i]>=nums2[j]):
                #Here we will add the element from nums1
                nums1[k]=nums1[i]
                
                i-=1
                k-=1
            else:
                #Here we will add the element from nums2
                nums1[k]=nums2[j]
                
                j-=1
                k-=1
        #print(nums1)
        #Here we will add the remaining elements
        if(j>=0):
            while(j>=0):
                nums1[k]=nums2[j]
                j-=1
                k-=1
                
            