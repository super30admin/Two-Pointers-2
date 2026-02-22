# problem 1 

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 2
        slow_ptr = k 
        fast_ptr = k

        while(fast_ptr < len(nums)):
            if nums[slow_ptr-k]!= nums[fast_ptr]:
                nums[slow_ptr]=nums[fast_ptr]
                slow_ptr+=1
            fast_ptr+=1
        return slow_ptr