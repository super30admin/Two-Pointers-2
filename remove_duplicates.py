# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
# I have two pointers, p1 and p2, p2 moves ahead and finds the correct elements and copies them to p1
# Once p2 goes out of array we return p1

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        left = 1
        right = 1
        length = len(nums)
        count = 1
        current = nums[0]
        k=2
        
        while right < length:
            nums[left] = nums[right]
            if nums[left] == current:
                count += 1
            else:
                current = nums[left]
                count = 1
                
            
            if count > k:
                while right < length and nums[right] == current:
                    right += 1
                
                if right < length:
                    nums[left] = nums[right]
                    current = nums[right]
                    count = 1
                else:
                    return left
                
                left+=1
                right+=1
            else:
                left+=1
                right+=1
                
        return left