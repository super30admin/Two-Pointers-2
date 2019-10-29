# accepted in leetcode
# time - O(N), space -O(1)
# used the 3 pointer approach as per the instructor.
class Solution:
    def removeDuplicates(self, nums):
        if len(nums) <= 2: return len(nums)
        prev = 0 # used to only capture the required elements
        fast = 1 # loop through
        slow = 1 # 
        flag = False
        while fast < len(nums):
            if nums[fast] == nums[prev]:
                if flag == False:
                    flag = True
                    nums[slow] = nums[fast]
                    slow += 1
                    fast += 1
                else:
                    fast += 1
            else:
                prev = fast
                nums[slow] = nums[fast]
                slow += 1
                fast += 1
                flag = False

        return slow


sol = Solution()
print(sol.removeDuplicates([1,1,2,2,2,2,3,4,4]))