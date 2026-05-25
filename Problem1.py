# Time Complexity --> O(n) where n is the size of array
# Space Complexity --> O(1)
# Approach --> Use slow and fast pointers where the fast pointer keeps check on number of duplicates. If the count is more than 2, we reset the count and irrespective of the conditions the fast pointer moves. 
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)<=1:
            return len(nums)
        slow = 1
        fast = 1
        count = 1
        while fast<len(nums):
            if nums[fast]==nums[fast-1]:
                count += 1
                if count<=2:
                    nums[slow] = nums[fast]
                    slow += 1
            else:
                count = 1
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow 
