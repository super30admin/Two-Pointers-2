# Time Complexity :O(n)
# Space Complexity :O(1)
# Leet Code: Yes

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 1:
            return 1
        
        slow = 0
        count = 2
        c = 1

        for i in range(1,n):
            if nums[i] == nums[i-1]:
                c += 1
            else:
                c = 1
            if c <= count:
                slow += 1
                nums[slow] = nums[i]
        return slow+1