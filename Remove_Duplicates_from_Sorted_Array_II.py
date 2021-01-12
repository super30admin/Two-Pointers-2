# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #Base case 
        if nums == None or len(nums) == 0:
            return 0
            
        # Two point approach
        count = 1
        slow = 1
        
        #Fast pointer check with previous value if it's same increment the count or else set to 1 (meaning we got a particular number k times)
        for fast in range(1, len(nums)):
            if nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1
            
            # Here task is to find for two element repeat so <= 2
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
        # return slow pointer position
        return slow
