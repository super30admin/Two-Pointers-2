# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''Using two pointers and a counter we can rewrite the array to get the desired result. 
Maintaining an idx that maintains the currently acceptable array.'''
# Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        fast = 0
        slow = 0
        idx = 0
        while fast < len(nums):
            count = 0
            while fast < len(nums) and nums[fast] == nums[slow]:
                count += 1
                fast += 1    
            repeat = min(count, 2) #we must at the most insert two values of the curret element
            for _ in range(repeat):
                nums[idx] = nums[slow]
                idx += 1
            
            slow = fast
        
        return idx
                