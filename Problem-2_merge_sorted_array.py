# APPROACH  1: BRUTE FORCE
# Time Complexity : O((n+m) lg(n+m)), m: len(nums1), n: len(nums2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Copy all elements of nums2 to end of nums1
# 2. Then sort the whole array num1
# 3.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        if nums1 is not None and nums2 is not None:
            insert1 = m
            for ind2 in range(len(nums2)):
                nums1[insert1] = nums2[ind2]
                insert1 += 1

            nums1.sort()




# APPROACH 2: INTERMEDIATE SOLUTION
# Time Complexity : O((n + m) * m),  m: len(nums1), n: len(nums2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Starting from begining of nums1 and nums2, compare element wise
# 2. If nums1's is less - proceed (as its in correct position)
# 3. If nums2's is less - need to create place for it in nums1 by shifting all elements of nums1 after it. 


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        if nums1 is not None and nums2 is not None:
            
            ind1, ind2, curr = 0, 0, 0
            
            while ind1 < m and ind2 < n:
                if nums1[ind1] <= nums2[ind2]:
                    ind1, curr = ind1 + 1, curr + 1
                else:
                    shift = len(nums1) - 2
                    while shift >= curr:
                        nums1[shift + 1] = nums1[shift]
                        shift -= 1
                    nums1[curr] = nums2[ind2]
                    curr, ind2, ind1, m = curr + 1, ind2 + 1, ind1 + 1, m + 1
            
            while ind2 < n:
                nums1[curr] = nums2[ind2]
                curr, ind2 = curr + 1, ind2 + 1
                    
                    
                    
 
# APPROACH 3: OPTIMAL SOLUTION
# Time Complexity : O(n + m)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Need to avoid shifting operation of last approach - so start from end of both arrays. Have a ptr to indicate the location to insert next valid element
# 2. If nums1's is greater then place it insert pos of nums1
# 3. Similarly for nums2 as well
# 4. There's no danger of overwriting nums1 elements -> either all elements of nums2 is greater than max of nums1 -> nums1's elements is in right position
#                                                   -> getting eements from both arrays, so the nums1's elemnts (where insert pos is poiniting) are already processed

 class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        if nums1 is not None and nums2 is not None:
            
            ind1, ind2, insert = m - 1, n - 1, m + n - 1
            
            while ind1 >= 0 and ind2 >= 0:
                
                if nums1[ind1] >= nums2[ind2]:
                    nums1[insert] = nums1[ind1]
                    ind1 -= 1
                
                else:
                    nums1[insert] = nums2[ind2]
                    ind2 -= 1
                    
                insert -= 1
                
            while ind2 >= 0:
                nums1[insert] = nums2[ind2]
                insert, ind2 = insert - 1, ind2 - 1
                    
                    
