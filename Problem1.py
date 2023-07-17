#Time complexity: O(n)
#Space complexity: O(1)
# Replace element at current with element at i when count<=2
# Increment count
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        current=0
        count=1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                count+=1
            else:
                count=1
            if count<=2:
                current=current+1
                nums[current]=nums[i]
        
        return current+1
            