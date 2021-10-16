class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #SC O(1)
        # TC O(n)
        if nums is None or len(nums) == 0:
            return 0
        cnt = 1
        i = 1
        j = 1
        while(i < len(nums)):
            if (nums[i] == nums[i-1]):
                cnt +=1
            else:
                cnt = 1
            if cnt <= 2:
                nums[j] = nums[i]
                j+=1
            i +=1
        return j
                   
