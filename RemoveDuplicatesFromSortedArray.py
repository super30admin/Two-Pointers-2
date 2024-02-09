# Time complexity is O(n) n is the number of elements
# Space complexity is O(1) did not use any extra space
class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:

        cnt = 0
        slow = 0
        # In this code slower pointer catch the element and place it on the proper place
        # cnt check the value of repeated elements and i is iterate over the elements
        for i in range(len(nums)):
            if i == 0 or nums[i] != nums[i-1]:
                cnt = 1
            else:
                cnt += 1

            if (cnt <= 2):
                nums[slow] = nums[i]
                slow += 1

        return slow
