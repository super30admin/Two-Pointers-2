'''

TC: O(n)
SC: O(1)

'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        p1, prev, p2 = 0, 0, 0
        
        while p2 < len(nums):
            while p2 < len(nums) and nums[prev] == nums[p2]:
                p2 += 1
            
            if p2 - prev >= 2:
                nums[p1] = nums[prev]
                nums[p1 + 1] = nums[prev]
                p1 += 2
            else:
                nums[p1] = nums[prev]
                p1 += 1
                
            prev = p2
        
        return p1