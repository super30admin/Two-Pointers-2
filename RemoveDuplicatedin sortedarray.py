#Time Complexity : O(N) where N is input
#Space Complexity : O(1)

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        left = 0
        right = 1
        flag = 0
        while(right< len(nums)):
            if nums[left] == nums[right]:
                if flag == 0:
                    flag = 1
                    left+=1
                    nums[left] = nums[right]
                    right+=1
                elif flag == 1:
                    right +=1
            elif nums[left]!=nums[right]:
                flag = 0
                left+=1
                nums[left] = nums[right]
                right+=1
        return left+1