#Time Complexity: O(n)
#Space Complexity: O(1)
#Leetcode: Yes

'''
Approach: Start from 2, if nums[s] = nums[f] increment 2. 
'''
class Solution:
    def removeDuplicates(self, nums):
        n = len(nums)
        if n<3:
            return n

        s, f = 2,2
        while(f<n):
            if nums[s-2] != nums[f]:
                nums[s] = nums[f]
                s+=1
            f+=1
        return s


obj = Solution()
nums = [1,1,1,2,2,3]
print(obj.removeDuplicates(nums))