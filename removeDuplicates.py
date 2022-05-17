'''
time complexity: O(n)
space complexity: O(1)
''' 
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        s=1
        count=1
        for i in range(1,len(nums)):
            if(nums[i]==nums[i-1]):
                count+=1

            else:
                count=1
            if(count<=2):
                nums[s] = nums[i]
                s+=1
        return s