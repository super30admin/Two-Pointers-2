#Time Complexity - O(n)
#space Complexity - O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        prev = nums[0]
        count = 1
        
        left = 0
        x = 1
        
        while x < len(nums):
            if nums[x] == prev and count == 1:
                count += 1
                if left + 1 == x:
                    left = x
                else:
                    left += 1
                    nums[left] = nums[x] 
            elif nums[x] == prev and count == 2:
                x += 1
                continue
            elif nums[x] != prev:
                if left + 1 == x:
                    prev = nums[x]
                    count = 1
                    left = x
                else:
                    left += 1
                    nums[left] = nums[x]
                    prev = nums[x]
                    count = 1
                
            x += 1
        
        return left + 1
                