'''
80. Remove Duplicates from Sorted Array II

TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(1)
LEETCODE: YES
DIFFICULTIES: Nope
'''

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        p1 = 1
        p2 = 1
        k = 2
        cnt = 1
        while p2 < len(nums):
            
            if nums[p2-1] == nums[p2]:
                cnt += 1    
            else:
                cnt = 1
                
            
            if cnt <= k:
                nums[p1] = nums[p2]
                p2 += 1
                p1 += 1
            else:
                p2 += 1
        return p1
                
