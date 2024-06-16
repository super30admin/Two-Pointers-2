# Time Complexity :
# O(n) 

# Space Complexity :  
# O(1) 


# Approach:
# Array manipulation, bu keeping count variable to track that each element apperas at most twice, then reset count.



class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums or len(nums)==0:
            return 0

        replaceIndex = 1
        count = 1 

        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1

            # check count= at max 2, accordingly overwrite the current index with new element found   
            if count<=2 :
                nums[replaceIndex] = nums[i]
                replaceIndex = replaceIndex + 1