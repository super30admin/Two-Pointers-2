class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        if len(nums) <= 2:
            # since we can have 2 duplicates
            return len(nums)
        
        count = 1
        j = 1 # slow pointer
        
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                if i != j:           # we dont need to swap if pointers are at same
                    nums[j] = nums[i]
                j += 1
                
        return j

# Keeping two pointers, slow and fast, with a count variable initialized with 1 to count the duplicates
# TC: O(N) SC: O(1)