# Time Complexity : O(n)
# Space Complexity : O(1) / in-place modifications, no extra space is being used other than for variables
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 1
        k = 2 # Here we are asked for two appearences of each element
        count = 1
        for fast in range(1,len(nums)):
            if nums[fast] == nums[fast-1]:
                count += 1 # If fast element is sma eas it's previous element increment count of the element
            else:
                count = 1 # Else reset count
            if count <= k:
                # If the count <= k, then update/override the elements at nums[slow] with nums[fast] and increnment slow
                nums[slow] = nums[fast]
                slow += 1
        return slow # Return slow ptr
                