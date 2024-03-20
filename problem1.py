#Time Complexity : O(n)
#Space Complexity : O(1)
#Any problem you faced while coding this : -

#The approach is to maintain two pointers - one for keep track of the current element's occurrence and the other to keep track of the 2nd occurrence and to replace new element with the subsequent occurrences.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0

        slow, count = 0, 1

        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            print("before -",nums[i], count, slow, nums)
            if count <= 2:
                slow += 1
                nums[slow] = nums[i]
            print("after - ",nums[i], count, slow, nums)
        return slow + 1