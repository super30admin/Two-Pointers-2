#Leetcode Problem: 15
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result=[]
        nums.sort()
        for i in range(len(nums)):
            if nums[i]>0:
                break
            if i==0 or nums[i-1]!=nums[i]:
                self.twoSum(nums,i,result)
        return result
    
    def twoSum(self,nums,i,result):
        start=i+1
        end=len(nums)-1
        while start<end:
            s=nums[i]+nums[start]+nums[end]
            if s<0:
                start+=1
            elif s>0:
                end-=1
            else:
                result.append([nums[i],nums[start],nums[end]])
                start+=1
                end-=1
                while start<end and nums[start]==nums[start-1]:
                    start+=1

#TC: O(n^2)
#SC: O(1)