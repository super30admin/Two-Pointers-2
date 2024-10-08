#T.C = O(n) S.C = O(1)
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        slow = 0
        fast = 0
        k = 2
        count = 0

        while(fast<n):
            if(fast>0 and nums[fast]==nums[fast-1]):
                count+=1
            else:
                count = 1

            if(count<=k):
                nums[slow] = nums[fast]
                slow+=1

            fast +=1

        return slow
            