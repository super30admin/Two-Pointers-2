# Time: O(n)
# Space: O(n)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        num_map = {}
        for num in nums:
            if num in num_map:
                num_map[num] += 1
            else:
                num_map[num] = 1
        pos = 0
        i = 0
        while i < n:
            num = nums[i]
            count = num_map[num]
            i += count
            steps = min(2, count)
            while steps > 0:
                nums[pos] = num
                steps -= 1
                pos += 1
        return pos

# Time : O(n)
# Space : O(1)        
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        slowP = 1
        count = 1
        k = 2
        for i in range(1, n):
            if nums[i] == nums[i-1]:
                count += 1
            else: count = 1
            if count <= k:
                nums[slowP] = nums[i]
                slowP += 1

        return slowP
        