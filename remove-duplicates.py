#  Time Complexity : O(n)
#  Space Complexity : O(1) array in place
#  Did this code successfully run on Leetcode :yes
#  Three line explanation of solution in plain english:

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count=1
        slow=1
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                count+=1
            else:
                count=1
            if count<=2:
                nums[slow]=nums[i]
                slow+=1
                
        return slow