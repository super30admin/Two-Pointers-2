# Time Complexity = O(n)
# Space Compelxity = O(1)


class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        if len(nums) < 2:
            return len(nums)
        
        n = len(nums)
        i = 1            # Initialising pointer i
        j = 1            # Initialising pointer j
        count = 1        # Initialising count to 1, as we are originally starting from index 1
        
        
        for i in range(1, n):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1
                
            if count <= 2:
                nums[j] = nums[i]
                j += 1
                
        
        return j