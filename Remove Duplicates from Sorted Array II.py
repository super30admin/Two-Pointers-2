class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #Time Complexity: O(n)
        #Space Complexity: O(1)
        #where, n is the length of nums
        
        slow_pointer, fast_pointer = 1, 1
        count = 1
        
        while fast_pointer < len(nums):
            if nums[fast_pointer] == nums[fast_pointer - 1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                nums[slow_pointer] = nums[fast_pointer]
                slow_pointer += 1
            
            fast_pointer += 1
        
        return slow_pointer