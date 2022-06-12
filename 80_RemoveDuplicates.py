#  Time Complexity : O(n)
#  Space Complexity : O(1)


class Solution:
    def removeDuplicates(self, nums):
        if nums == None:
            return 0

        n = len(nums)
        slow = 1
        count = 1

        for i in range(1,n):
            if nums[i] == nums[i-1]:
                count = count + 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[i]
                slow = slow + 1
            
        return slow

obj = Solution()
print(obj.removeDuplicates([1,1,1,2,2,3]))