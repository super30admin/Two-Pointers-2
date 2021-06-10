# Time Complexity : O(n**2)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : No
# Any problem you faced while coding this : Something is missing in the code

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        l = len(nums)
        pres = nums[0]
        count = 1
        i = 1
        
        while i < l:
            if nums[i] == pres:
                count += 1
                i += 1
            else:
                diff = count - 2
                if diff > 0:
                    j = i
                    while j < l:
                        nums[j-diff] = nums[j]
                        j+=1
                    i = i - diff + 1
                    l = l - diff
                    while diff > 0:
                        nums[l+diff-1] = pres
                        diff -= 1
                    pres = nums[i]
                    count = 1
                else:
                    pres = nums[i]
                    count = 1
                    i += 1
                
        return l
                        