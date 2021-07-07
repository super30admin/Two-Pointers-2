# Leet code - Remove Duplicates from Sorted Array II -80
# Time complexity - O(N)
# Space - O(1)
# Approach - Three pointers approach




class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) <= 2: return len(nums)
        prev = 0 
        fast = 1 
        slow = 1 
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

