# time: O(n)
# space: O(1)
class Solution(object):
    def removeDuplicates(self, nums):
        slow, fast = 0, 0
        while fast < len(nums):
            cnt = 0
            element = nums[fast]
            while fast < len(nums) and nums[fast] == element:
                cnt += 1
                fast += 1
            print(element, cnt)
            for i in range(min(cnt, 2)):
                nums[slow] = element
                slow += 1
            # fast += 1
        #     print(slow, fast)
        # print(nums)
        return slow
                
           