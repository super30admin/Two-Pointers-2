#TC:O(n)
#SC:O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        counter = 0
        insert = 0
        for running in range(len(nums)):
            if running == 0 or nums[running - 1] == nums[running]:
                counter += 1
            else:
                counter = 1
            if counter <= 2:
                nums[insert] = nums[running]
                insert += 1
        return insert