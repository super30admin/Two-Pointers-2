'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

# 80. Remove Duplicates from Sorted Array II

# Given a sorted array nums, remove the duplicates in-place such that 
# duplicates appeared at most twice and return the new length.

# Do not allocate extra space for another array; you must do this by 
# modifying the input array in-place with O(1) extra memory.

# Example 1:
# Input: nums = [1,1,1,2,2,3]
# Output: 5, nums = [1,1,2,2,3]
# Explanation: Your function should return length = 5, with the first five 
# elements of nums being 1, 1, 2, 2 and 3 respectively. It doesn't matter 
# what you leave beyond the returned length.

# Example 2:
# Input: nums = [0,0,1,1,1,1,2,3,3]
# Output: 7, nums = [0,0,1,1,2,3,3]
# Explanation: Your function should return length = 7, with the first seven 
# elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively. It 
# doesn't matter what values are set beyond the returned length.

#-----------------
# Time Complexity: 
#-----------------
# O(N): Where N is no. of elements in input array

#------------------
# Space Complexity: 
#------------------
# O(1): No extra space for auxiliary data structure

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 0:
            return 0

        elif n <= 2:
            return n

        else:
            count = 1
            i = 1 # Array iteration ptr (always increment)
            j = 1 # Slow ptr (increment if count <= k)
            k = 2 # No. of occurrences allowed before being called a duplicate
            
            while i < n:
                # If same element as previous, increment count by 1
                if nums[i] == nums[i-1]:
                    count += 1
                else:
                    # IF new element, reset count. Works cause sorted
                    count = 1
                
                if count <= k:
                    nums[j] = nums[i]
                    j += 1
                
                i += 1

            return j