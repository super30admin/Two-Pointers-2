#0(N^2) TIME AND O(1) SPACE
# THIS IS BRUTE FORCE APPROACH
class Solution:
    def removeDuplicates(self, nums):
        if len(nums) == 0:
            return 0
        last_seen = nums[0]
        last_seen_count = 1
        i = 1
        while i < len(nums):
            num = nums[i]
            if num == last_seen:
                if last_seen_count == 2:
                    nums.pop(i)
                    continue
                last_seen_count += 1
            else:
                last_seen = num
                last_seen_count = 1
            i += 1
        return len(nums)

s = Solution()
s.removeDuplicates([1,1,1,2,2,3])