class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #placeholder
        pos=0
        #initial count
        count=1
        #start from 1st index to compare with previous value
        for i in range(1,len(nums)):
            #if not matched, place it in nums and keep new count as 1 only
            if nums[i]!=nums[i-1]:
                pos+=1
                count=1
                nums[pos]=nums[i]
            #if matched, increase count and check if count<=2 then only place in nums
            else:
                count+=1
                if count<=2:
                    pos+=1
                    nums[pos]=nums[i]
        #return length       
        return pos+1
#O(N)
#O(1)