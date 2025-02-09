#TIme Complexityy :O(n)
# Space COmplexity : O(1)
# Able to run on leetcode :Yes

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count =1
        slow =1
        for i in range (1,len(nums)):
            if (nums[i]==nums[i-1]):
                count+=1
            else:
                count=1
            if(count<=2):
                nums[slow]=nums[i]
                slow+=1
        return slow        