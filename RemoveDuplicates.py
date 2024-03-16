# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #Using this pointer to write the elements
        ptr = 0
        count=0
        for i in range(len(nums)):
            if i==0 or nums[i]==nums[i-1]:
                count+=1
            else:
                count=1
            #We will check if count<=2
            if count<=2:
                nums[ptr]=nums[i]
                ptr+=1
        return ptr
        