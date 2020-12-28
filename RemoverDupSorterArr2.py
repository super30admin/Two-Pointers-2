# TC : O(n) ; n = len of array
# SC : O(1)
# Approach : Two pointers i and j. j keeps track of replacing element and i is used to move forward.
# Whenever count > 2, we do nums[j] = nums[i] and increment j, and also when nums[i] != nums[i-1], we 
# reset counter to 1.
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums or len(nums) == 0:
            return 0
        j = 1 ; cnt = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                cnt += 1
            else:
                cnt = 1
            if cnt <= 2:
                nums[j] = nums[i]
                j += 1
        
        return j