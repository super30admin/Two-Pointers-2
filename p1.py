## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
# TC : O(n)
# SC : O(1)
# The selection of pointers/pointer got tricky with pointers questions
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1
        j = 1
        count = 1
        while i< len(nums):
            # print(i, nums[i])
            if nums[i]==nums[i-1]:
                count += 1
            else:
                count = 1
                # i += 1
            if count > 2:
                nums.pop(i)
            else:
                i += 1
        # print(i)
                
                    
                
            
        
        