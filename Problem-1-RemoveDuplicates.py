class Solution:
    def removeDuplicates(self, nums) :
        if nums == None:
            return 0
        if len(nums) <= 2:
            return nums
        count = 1
        j = 1

        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[j] = nums[i]
                j += 1

        return j
sol=Solution()
nums=[1,1,1,2,2,3,3,3,3,4,5,5,5,5,5,6,6]
print (sol.removeDuplicates(nums))
