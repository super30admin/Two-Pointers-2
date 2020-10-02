"""
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
"""
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Start from end put max number to the end of first array and update it in decending order.
        """
        # Run time Complexity : O(N)
        # Space Complexity: O(1)
        p1=m-1
        p2=n-1
        mp=len(nums1)-1
        while(p1>=0 and p2>=0):
            if(nums1[p1]<nums2[p2]):
                nums1[mp]=nums2[p2]
                p2-=1
            else:
                nums1[mp]=nums1[p1]
                p1-=1    
            mp-=1
        
        #Adding remaining elements!
        nums1[:p2+1]=nums2[:p2+1]