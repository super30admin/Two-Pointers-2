# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(n)
# Space Complexity : Average : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Condition when to increament value of j

class Solution:
    '''
    - Use two pointers method
    - First pointer will iterate the list as usual
    - Second pointer will point to where the last value should be placed when count is less than 2
    '''
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        i, j = 0, 1
        while i < len(nums) - 1:
            i += 1
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1
        return j