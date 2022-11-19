# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode: Yes
# Three line explanation of solution in plain english

# Here we start at index 1 since the first element would any way be in the correct position
# if the current element is same as the previous element we increment the count
# if not, we reset the count
# if the count is less than or equal to 2 we update the slow index with that of the fast and increment both
# if not we increment the fast, so when it encounters a new element we can update the slow index
# we return the slow index as the nums before that would contain the correct array
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow:int = 1
        fast:int = 1
        count:int = 1
        n = len(nums)

        while slow<n and fast<n:
            if nums[fast] == nums[fast-1]:
                count+=1
            else:
                count=1
            if count<=2:
                nums[slow] = nums[fast]
                slow+=1
                fast+=1
            else:
                fast+=1
        return slow