#Time Complexity : 0(n)
#Space Complexity : o(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        i = 1

        for j in range(1,len(nums)):
            if nums[j] == nums[j-1]:
               count+=1
            else:
               count=1

            if count<=2:
               nums[i] = nums[j]
               i+=1
        return i