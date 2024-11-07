#Time Complexity : O(n)
#Space Complexity: O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        slow = 0

        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count +=1
            else:
                count = 1
            if count <=2:
                slow +=1
                nums[slow] = nums[i]
        return slow+1