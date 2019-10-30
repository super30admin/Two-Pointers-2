"""
Time complexity - O(n)
Space Complexity - O(1)
"""
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) < 2 :
            return len(nums)
        p1,p2 = 0,1
        duplicate = False
        while p2 < len(nums) :
            if (nums[p2] == nums[p1]) and (not duplicate):
                p1 += 1
                nums[p1] = nums[p2]
                duplicate = True
            elif (nums[p2] != nums[p1]) :
                p1 +=1
                nums[p1] = nums[p2]
                duplicate = False
            p2 +=1
        return p1+1
