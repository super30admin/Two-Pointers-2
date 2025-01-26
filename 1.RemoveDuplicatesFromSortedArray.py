"""
Time Complexity: O(n)
Space Complexity: 0(n)
Approach:
    1. Two Ptrs
    2. If count <= k, nums[slowPtr] will have nums[i] value and then only move slowPtr += 1
    3. Like this slowPtr will always end up at the correct postion.
"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        

        # use two ptrs approach
        # slow ptr will end up at the correct position where we should have exactly 2 count of elements

        count = 1
        slowPtr = 1

        for i in range(1,len(nums)):

            if nums[i] == nums[i-1]:
                count += 1
            else:
                # not-equal -- this is new element
                count = 1
            

            # check for count
            if count <= 2:
                # allowed to keep atmost (k) duplictas
                nums[slowPtr] = nums[i]
                slowPtr += 1
        
        # end of for loop

        return slowPtr