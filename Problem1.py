#T.C. O(n)
#S.C O(1)

#Approach: Two pointers
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        n = len(nums)
        slow = 0 
        count = 0
        for i in range(n):
            if i == 0 or nums[i] == nums[i-1]:
                count+=1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[i]
                slow+=1
        return slow
