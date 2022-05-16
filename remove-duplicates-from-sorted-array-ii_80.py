#Time Complexity O(N) One pass for traversing list array using Two pointers
#Space Complexity O(1)
#It successfully runs on the leetcode

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums: return 0
        slow, fast, count = 1, 1, 1
        while fast < len(nums):
            count = count + 1 if nums[fast] == nums[fast-1] else 1
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
                fast += 1
            else:
                fast += 1
        return slow
        