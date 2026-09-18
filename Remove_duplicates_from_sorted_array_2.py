# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
# I have used two pointers one is slow which starts from first index and i to iterate over the array starting from first index as well
#If the element at i = element at i-1 then we increase the count else we reset the count
#Then if the count < k we replace element at slow with element at i and increment slow pointer then return slow


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 1
        count = 0
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 0
            if count < 2:
                nums[slow] = nums[i]
                slow += 1
        return slow

        