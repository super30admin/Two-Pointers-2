# Time Complexity : O(n + m) 
# Space Complexity : O(1) (We are running algorithm in place)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# - This is similer to merging two array in divide and conqure for sorting but in reverse.
 
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
#       Initialize m, n and k. m and n is already given, we have to just reduce it by 1 because array starts from 0. K is sum of m and n or length of first array which also has exact space for merging second array.
        m = m - 1
        n = n - 1
        k = len(nums1) - 1
#       We will run this loop until m or n reach less than zero.
        while(n > -1 and m > -1):
#           If number in nums1 is greater than number in nums2we will append it to k index and reduce m index
            if nums1[m] > nums2[n]:
                nums1[k] = nums1[m]
                m -= 1
#           If number in nums2 is greater than number in nums1 we will append it to k index and reduce n index
            elif nums1[m] < nums2[n]:
                nums1[k] = nums2[n]
                n -= 1
#           If both numer are same we can append both of them to the k. M and n will be reduced once but k needs to reduce twice.
            else:
                nums1[k] = nums1[m]
                k -= 1
                m -= 1
                nums1[k] = nums2[n]
                n -= 1
#           Every time we are reducing k
            k -= 1
    
#       because we are stopping our while loop if m or n any one of them reach to -1. The other one might not have reached to -1.     
#       Checking if m reached to -1.(If all element from nums1 are appended or not)
        if m > -1:
#           If some elements remained in nums1 we will append it to k
            while( m > -1):
                nums1[k] = nums1[m]
                k -= 1
                m -= 1
                
#       Checking if n reached to -1.  
        if n > -1:
#           If some elements remained in nums2 we will append it to k
            while (n > -1):
                nums1[k] = nums2[n]
                k -= 1
                n -= 1
