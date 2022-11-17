class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        ## T.C = O(n)
        ## S.C = O(1)
        
        if len(nums) <= 2:
            return len(nums)
        
        i, j = 1, 1
        count = 1
        
        while i<len(nums):
            
            if nums[i] == nums[i-1]:
                count += 1
                if count <= 2:
                    nums[j] = nums[i]
                    i += 1
                    j += 1
                else:
                    i += 1
            else:
                count = 1
                nums[j] = nums[i]
                i += 1
                j += 1
                
        return j
        