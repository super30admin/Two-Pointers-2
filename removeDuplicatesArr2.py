class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        prev = nums[0]
        slow = 1
        fast = 1

        while fast < len(nums):
            if nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
            
            fast += 1
        
        return slow

# TC: O(n)
# SC: O(1)
            