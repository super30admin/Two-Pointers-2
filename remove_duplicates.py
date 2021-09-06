# time complexity: O(N)
# space complexity: O(1)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j = 0
        count = 1
        for i in range(0, len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                count +=1
            else:
                count = 1
            
            if count <= 2:
                nums[j] = nums[i]
                j+= 1
            
        
        return j