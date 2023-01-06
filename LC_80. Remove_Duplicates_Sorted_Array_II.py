'''
   s
[1,1,1,2,2,3]
f


'''


class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # if nums == [] or len(nums) == 0:
        #     return 0

        # slow = 0
        # count = 0
        # k = 2 #allowed number of duplicates
        # for i in range(len(nums)):
        #     if nums[i] == nums[i-1]:
        #         count = count + 1
        #     else:
        #         count = 1
            
        #     if count<=k:
        #         nums[slow] = nums[i]
        #         slow = slow + 1

        # return slow


        if nums == [] or len(nums) == 0:
            return 0

        slow = 0
        fast = 0
        counter = 0
        k = 2

        while(fast<=len(nums)-1):
            if nums[fast] == nums[fast-1]:
                counter = counter + 1
            else: counter = 1

            if counter<=k:
                nums[slow] = nums[fast]
                slow = slow + 1
            fast = fast + 1
        return slow


            




            