#80. Remove Duplicates from Sorted Array II
"""
Time Complexity : O(n)
Space Complexity : O(1)

"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        m = 0
        k = 2
        slow = 0
        fast = slow + k
        count=0
        
        m = max(nums) + 1 #O(n)
        curr = m
        
        #nums.append(m)
        
        while fast < len(nums): #O(n)
            
            if nums[slow] == nums[fast] or curr == nums[fast]:
                curr = nums[fast]
                nums[fast] = m
                count+=1
                fast = fast + 1
                slow = slow + 1
                
            elif nums[slow] != nums[fast]:
                slow = slow + 1
                fast = fast + 1
                
        nums.sort() #O(n logn)
        
        print(count)
        print(nums[0: len(nums)-count]) #O(n)
        return len( nums[0: len(nums)-count] )
