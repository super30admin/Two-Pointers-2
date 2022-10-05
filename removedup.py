'''
Time Complexity: O(n)
Space Complexity:O(1)
'''
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        m = l = 1
        count = 1
        while(m<len(nums)):
            if(nums[m]==nums[m-1]):
                count +=1
            else:
                count = 1
            if(count<=2):
                nums[l] = nums[m]
                l +=1
                m +=1
            else:
                m +=1
        return l