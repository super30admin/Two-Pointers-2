# // Time Complexity : O(n)
# // Space Complexity : O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        s = 1
        f = 1

        count = 1

        while(f <= len(nums) - 1):

            if(f>0 and nums[f]==nums[f-1] and count>2):
                f+=1
            elif(f>0 and nums[f]==nums[f-1] and count < 2):
                count +=1
                nums[s] = nums[f]
                s+=1
            elif(f>0 and nums[f]!=nums[f-1]):
                count = 1
                nums[s] = nums[f]
                s+=1
            f+=1
        return s


