# TC: O(m + n)
# SC: O(1)
# LeetCode: Y(https://leetcode.com/problems/merge-sorted-array)
# Approach: Move the greater number from end of both the arrays to the extreme end of first array, update respective pointers
#           It may occur that all the larger numbers in nums1 array may have moved to the back but all the smaller numbers from nums2 may not have been copied to the beginning of nums1 array. 
#           So for this loop until all the numbers from nums2 are copied into nums1
            

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # p1 at the end of sorted non-zero numbers of nums1
        p1 = m - 1
        
        # p2 at the end of sorted numbers of nums2
        p2 = n - 1
        
        # i at the end of the nums1
        i = m + n - 1
        
        # loop until either of nums1 or nums2 is in-place in nums1
        while p1 >= 0 and p2 >= 0:
            
            # if the number at end of nums1 is greater than number at end of nums2
            if nums1[p1] > nums2[p2]:
                
                # copy the number from nums1 in the middle to the end
                nums1[i] = nums1[p1]
                
                # move p1
                p1 -= 1
                
            # if the number at end of nums2 is greater than or equal to the number at end of nums1
            else:
                # copy the number from nums2 to the end in nums1
                nums1[i] = nums2[p2] 
                
                # move p2
                p2 -= 1
               
            # move i after each pass
            i -= 1
           
        # if there are elements in nums2 remaining to be copied to nums1
        while p2 >= 0:
            
            # copy number from end of nums2 to nums1
            nums1[i] = nums2[p2]
            
            # move i
            i -= 1
            
            # move p2
            p2 -= 1
            
        
