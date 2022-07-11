# Problem2 (https://leetcode.com/problems/merge-sorted-array/)

'''
Time Complexity : O(M+N)
Space Complexity : O(1)
'''
class Solution:
    
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        '''
        Approach
        using three pointers at end of each array
        check if array1[p1] > array2[p2] or array2[p2] > array1[p1] swap the max with array1[p3]
        if anything still left in p2 then write then on p3 of array1
        '''
        p1 = m-1
        p2 = n-1
        p3 = m+n-1
        while(p1>=0 and p2 >=0):
            if(nums1[p1]>=nums2[p2]):
                nums1[p3] = nums1[p1]
                p1 = p1-1
                p3 = p3 -1
            else :
                nums1[p3] = nums2[p2]
                p2 = p2 -1
                p3 = p3-1
        while(p2>=0):
            nums1[p3] = nums2[p2]
            p3 = p3 - 1
            p2 = p2 -1
        
