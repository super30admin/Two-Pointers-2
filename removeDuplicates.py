class Solution(object):
    # Time Complexity is O(n)
    # Space complexity is O(1)
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        slow = 1
        fast = 1
        cnt = 1
        while(fast < len(nums)):
            if(nums[fast] == nums[fast-1]):
                cnt += 1
            else:
                cnt = 1
            if(cnt < 3):
                nums[slow] = nums[fast]
                slow+=1
            fast+=1
        return slow