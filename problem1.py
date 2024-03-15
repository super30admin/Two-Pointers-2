# Time complexity is O(N) and space complexity is O(1)
class Solution(object):
    def removeDuplicates(self, nums):
        l=0
        r=0
        
        while r< len(nums):
            count=1
            while r+1 < len(nums) and nums[r]== nums[r+1]:
                count+=1
                r+=1
            for i in range(min(2, count)):
                nums[l] = nums[r]
                l+=1
            r+=1
        return l
            
            
