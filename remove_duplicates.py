# Time Complexity : O(N) when N is number of elements
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def removeDuplicates(self, nums) -> int:
        count, pos, exp = 1, 1, 1
        
        while exp < len(nums):
            if nums[exp] == nums[exp - 1]:
                count += 1
            else:
                count = 1
            
            
            if count <= 2:
                nums[pos] = nums[exp]
                pos += 1
            
            exp += 1
        
        return nums[:pos]

solution = Solution()
print(f'OUTPUT >> {solution.removeDuplicates([0,0,1,1,1,1,2,3,3])}')