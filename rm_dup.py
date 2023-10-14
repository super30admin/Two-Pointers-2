# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if(nums==None or len(nums)==0): 
            return 0
        count=0
        slow=0
        for i in range(len(nums)):
            if(i==0 or nums[i] != nums[i-1]):
                count=1
            else:
                count+=1
            if(count<=2):
                nums[slow]=nums[i]
                slow+=1
        return slow

        