''' Time Complexity : O(n) 
    Space Complexity : O(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No


   Approach : Maintain 2 pointers from end of array, and one right pointer at end of 1st array
               swap the largest element at end of array and move the right pointer inside
'''

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        r = (m+n)-1
        print(p1,p2,r)
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] >= nums2[p2]:
                nums1[r] = nums1[p1]
                r -= 1
                p1 -= 1
            else:
                nums1[r] = nums2[p2]
                r -= 1
                p2 -= 1
        while p2 >= 0:
            nums1[r] = nums2[p2]
            r -= 1
            p2 -= 1