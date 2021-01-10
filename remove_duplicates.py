# -*- coding: utf-8 -*-
"""
TC : O(N) N is the no. of elements in the given array
SC: O(1) : no extra space used
"""

class Solution:
    def removeDuplicates(self, nums:[]) -> int:
        #edge case
        if not nums or len(nums) == 0:
            return -1
        #declare two pointers, slow n fast, which iterate through the array 
        slow = 1
        fast = 1
        count = 1 #initial count =1
        for fast in range(fast,len(nums)): #iterate through the array via fast pointer
            if nums[fast] == nums[fast - 1]: #compare the contents of current position with last position
                count += 1 #increment count if same elements present
            else:count = 1                 #else reset count
            if count <= 2: #check for count at most 2
                nums[slow] = nums[fast] #assign the contents of fast to slow
                slow += 1        #increment slow pointer
        return slow #return the pointer which is pointing to the correct location(all elements in array are present atmost twice)
