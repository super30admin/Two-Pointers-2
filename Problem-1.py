# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #how many times has a certain number happened
        count = 1
        #pointer to the place that the non duplicates should be in
        j = 1
        for i in range(1,len(nums)):
            # if this is a duplicate increase count
            if nums[i] == nums[i-1]:
                count +=1
            else:
                #else return count to one as this is the first time we see this number
                count =1
            # if count more than 2 copy to the right place and increae it by one
            if count <=2:
                nums[j] = nums[i]
                j+=1
        return j