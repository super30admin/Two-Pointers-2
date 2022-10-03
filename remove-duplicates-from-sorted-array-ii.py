# Time Complexity: O(n)
# Space Complexity: O(1)

# The code successfully ran on leetcode

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0 or nums == None:
            return 0
        
        i = 1
        j = 1
        count = 1
        current = nums[0]
        
        while(i < len(nums)):
            if nums[i] == current:
                count += 1
                if count <= 2:
                    nums[j] = nums[i]
                    j += 1

            else:
                current = nums[i]
                count = 1
                nums[j] = nums[i]
                j += 1
            
            i += 1
        
        return j 