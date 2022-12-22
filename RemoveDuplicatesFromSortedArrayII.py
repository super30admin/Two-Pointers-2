#Time Complexity: O(n)
#Space Complexity: O(1)
#Successfully ran on leetcode

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        n = len(nums)
        j = 1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                count+=1
            else:
                count = 1
            if count<=2:
                nums[j]=nums[i]
                j+=1
        return j