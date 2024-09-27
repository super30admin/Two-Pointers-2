# Time Complexity : O(n) where n is the number of unique values in nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Did you find any difficulty : Yes, I was not able to come up with a solution using two pointers

class Solution:
    def removeDuplicates(self, nums):
        if len(nums) <3 or len(nums) == len(set(nums)):
            return len(nums)

        num_set = set(nums)
        for i in num_set:
            while nums.count(i) >2:
                nums.remove(i)
        return (len(nums))

# Here I checked if the length of nums is less than 3 or all values are unique then I will simply return length of nums.
# Otherwise, I will first create a set of list which will have all the unique values. Then I will find the count of each
# number and if the count is greater than 2 then I will remove the occurances of that number.