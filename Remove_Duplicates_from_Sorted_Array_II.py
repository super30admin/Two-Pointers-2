class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return
        
        
        count = 1
        slow, fast = 1,1
        while fast < len(nums):
            if nums[fast] == nums[fast-1]:
                count +=1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
            
            fast += 1
        return slow
