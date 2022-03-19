#Time Complexity : O(n+m)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : YES
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        second_last = n - 1
        first_last = m - 1
        index = m + n - 1
        
        while second_last >= 0 and first_last >= 0 :
            if nums2[second_last] > nums1[first_last]:
                nums1[index] = nums2[second_last]
                second_last -=1
                index -=1
            else:
                nums1[index] = nums1[first_last]
                index -=1
                first_last -=1
 
        while second_last >= 0:
            nums1[index] = nums2[second_last]
            second_last -=1
            index -=1
            
        return nums1
            
                
                