# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        p1=0
        p2=1
        count=1
        while (p2<len(nums)):
            if nums[p2]==nums[p1]:
                if count>=2:
                    p2+=1
                    continue
                else:
                    count+=1
            else:
                count=1            
            p1+=1
            nums[p1]=nums[p2]
            p2+=1
        return p1+1

        