# // Time Complexity :O(n)
# // Space Complexity :O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow=1
        count=1
        for fast in range(1,len(nums)):
            if nums[fast]==nums[fast-1]:
                count+=1
                if count<=2:
                    nums[slow]=nums[fast]
                    slow+=1
            else:
                count=1
                nums[slow]=nums[fast]
                slow+=1
        return slow
            
        