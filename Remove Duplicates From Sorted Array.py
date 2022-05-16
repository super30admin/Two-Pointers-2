'''
Time Complexity: O(N), where N is length of list nums
Space Complexity: O(1)
Successfully executed: Yes
Challenges Faced: No
'''

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        if nums == [] or len(nums) == 0:
            return 0
        
        slow = 1
        count = 1
        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                nums[slow] = nums[i]
                slow += 1
        
        return slow
        