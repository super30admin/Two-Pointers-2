
# // Time Complexity :
# // Space Complexity :
# // Did this code successfully run on Leetcode :
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach



class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        slow = 0
        count = 0
        k = 2
        fast = 0

        while fast < n :
            if fast != 0 and nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1
            
            if count <= k:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow


