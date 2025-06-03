## remove-duplicates-from-sorted-array-ii

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
    # have a slow at 1, counter = 1 
    # check next with fast pointer, if same, counter ++ - if not, counter = 1
    # if counter <= 2, nums[slow] = nums[fast] & move slow ++
    # reutrn slow for k

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 1
        counter = 1
        l = len(nums)
        for i in range(1, l):
            if nums[i] == nums[i-1]:
                counter += 1
            else:
                counter = 1
            if counter <= 2:
                nums[slow] = nums[i]
                slow += 1 
        return slow