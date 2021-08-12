from collections import Counter
class Solution:
    """
    Hash map approach with a drawback of extra space
    TC - O(n)
    SC - O(n)
    """
    def approach1(self, nums) -> int:
        count = Counter(nums)
        x = 0
        ans = 0
        for i, j in count.items():
            if j >= 2:
                nums[x] = i
                nums[x + 1] = i
                x += 2
                ans += 2
            if j < 2:
                nums[x] = i
                x += 1
                ans += 1
        return ans

    """
    Two pointer approach: 
    TC - O(n)
    SC - O(1)
    """
    def approach2(self, nums):
        cnt, i, j = 1, 1, 1
        while (i < len(nums)):
            if nums[i] == nums[i - 1]:
                cnt += 1
            else:
                cnt = 1
            if cnt <= 2:
                nums[j] = nums[i]
                j += 1
            i += 1
        return j

    def removeDuplicates(self, nums: List[int]) -> int:
        if nums is None or not nums:
            return 0
        return self.approach2(nums)
