# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

class Solution:

    # Brute force
    # def removeDuplicates(self, nums):
    #     k = 2
    #     freq_map = {}
    #     temp = []
    #     for num in nums:
    #         freq_map[num] = freq_map.get(num,0)+1
    #         if freq_map[num] <= k:
    #             temp.append(num)
    #         for i in range(len(temp)):
    #             nums[i] = temp[i]
    #     return len(temp)

    def removeDuplicates(self, nums):
        slow = 1
        k = 2
        count = 1
        for fast in range(1,len(nums)):
            if nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1
            
            if count <= k:
                nums[slow] = nums[fast]
                slow += 1

        return slow
    

nums = [0,0,1,1,1,1,2,3,3]
sl = Solution().removeDuplicates(nums)
print(sl)