"""
https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
We take a particular number and check if there are duplicates near at the consecituve index. If found we increase count,
else we set the count to 1. We check the overall count in an iteration and if less than eqaul to k we put the value to the initial index
and increment it by 1. This algorithm can be customized for any k i.e how many number of duplicates allowed.
Tc: On)
Sc: O(1)
"""


class Solution:
    def removeDuplicates(self, nums):
        if len(nums)==0 or nums is None:
            return 0
        j=0
        count=0
        for i in range(len(nums)):
            if nums[i]==nums[i-1] and i>0:
                count+=1
            else:
                count=1
            if count<=2:
                nums[j]=nums[i]
                j+=1
        # print(nums)
        # print(j)
        return j


        # slowp = 0
        # for i in range(len(nums) - 1):
        #     if nums[i] == nums[i + 1]:
        #         fastp += 1
        #     else:
        #         nums[slowp]=nums[fastp]
        #         slowp+=1
        #         # fastp+=1
        # return nums


nums = [1,1,1,2,2,3]
solve=Solution()
print(solve.removeDuplicates(nums))




