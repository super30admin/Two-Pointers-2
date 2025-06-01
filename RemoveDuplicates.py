
# Time complexity - o(n)
# Space complexity - o(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        l,r = 0,0

        n = len(nums)
        count = 1

        while r<n:

            if count <= 2:
                nums[l] = nums[r]
                l+=1
                r+=1
            else:
                r+=1
            
            if r<n and nums[r]==nums[r-1]:
                count+=1
            else:
                count = 1
        return l

