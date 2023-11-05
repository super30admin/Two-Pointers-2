#TC: O(n) , n is elements of arr
#SC: O(1) , in place
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        
        n = len(nums)
        slow = 0
        count = 0
        
        for i in range(0, n):
            if i== 0 or nums[i] != nums[i-1]:
                count = 1
            else:
                count += 1
            
            if count <= 2:
                nums[slow] = nums[i]
                slow += 1
        print(nums[i:slow +1])
        return slow