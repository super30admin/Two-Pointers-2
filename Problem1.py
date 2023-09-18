# tc: O(n)
# sd: O(1)
class Solution:
    def removeDuplicates(self, nums):
        n, k, count = len(nums), 1, 1
        for i in range(1, n):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[k] = nums[i]
                k += 1            
        return k
