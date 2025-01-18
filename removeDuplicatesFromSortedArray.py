class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0
        i = 1
        k = 2 # Number of duplicates allowed including the unique element
        count = 1
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= k:
                slow += 1
                nums[slow] = nums[i]
                
        return slow + 1
# --------Time O(n), Space = O(1)
        
        