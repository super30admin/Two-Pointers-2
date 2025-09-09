"""
Space Complexity: O(1) no extra space

Time Complexity: O(n) linear time complexity

"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        slow = 0
        count = 0
        for i in range(len(nums)): 

            if i>0 and nums[i] == nums[i-1]: 
                count +=1

            else: 
                count = 1

            if count <= 2:
                nums[slow] = nums[i]
                slow+=1
        
        return slow
