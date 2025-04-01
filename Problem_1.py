# Time Complexity = O(n)
# Space Complexity = O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        prev=0
        slow=1
        fast=1
        flag=0

        while fast<len(nums):
            if nums[fast]==nums[prev]:
                if flag ==0:
                    nums[slow] = nums[fast]
                    slow =slow + 1
                    fast = fast + 1
                    flag = 1
                else:
                    fast = fast + 1
            else:
                prev = fast
                nums[slow] = nums[fast]
                slow = slow + 1
                fast = fast + 1
                flag = 0 
        return slow

       


        