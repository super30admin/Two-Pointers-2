# Time Complexity : O(n), single pass
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        fill = 0
        N = len(nums)

        while i < N:
            num = nums[i]
            i += 1
            count = 1
            while i < N and nums[i] == num:
                i += 1
                count += 1 
            if count == 1:
                nums[fill] = num
                fill += 1
            elif count > 1:
                j = fill
                while fill< N and fill < j + 2:
                    nums[fill] = num
                    fill += 1
        
        return fill
