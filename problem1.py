'''https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/'''


# Time Complexity : O(N+M)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def removeDuplicates(self, nums: 'list[int]') -> int:
        if nums is None or len(nums) == 0: return 0
        if len(nums) == 1: return 1
        
        # 2 pointers
        slow = 1
        fast = 1
        count = 1
        
        n = len(nums)
        
        while fast < n:
            if nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
                fast += 1
            else:
                fast += 1
            
        return slow
            
                    
            
            
            
        