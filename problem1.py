'''
Time Complexity :O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation: Choose 2 pointers one for the the current element adn one for next, if current element == previous then
increase count. If count <2 then replace the element(this deletes the third or more element) else count is 1.
'''

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        high = 1
        count = 1
        for low in range(1, len(nums)):

            if nums[low] == nums[low - 1]:
                count += 1
            else:
                count = 1

            if count <= 2:
                nums[high] = nums[low]
                high += 1
        return high