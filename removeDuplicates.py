"""
80. Remove Duplicates from Sorted Array II

Write an efficient algorithm that searches for a value in an m x n matrix. 



Approach 1 ---
1. Check each element with previous element and update count. If element is present more than twice, remove the element


Time = O(n), n = number of elements
Space = constant = O(1)
"""
class RemoveDuplicates:
        def removeDuplicates(self, nums: List[int]) -> int:
            for i in range(1,len(nums)):
                count = 0
                if nums[i] == nums[i-1]:
                    count += 1
                    if count > 1:
                        nums.remove(nums[i])
            return nums
        
        
"""
Approach 2 ---
1. Use first and cur pointer to iterate throught given array and flag to mark repetition. 
2. If the current number is equal to previous number and flag is True, Increase the count and mark flag as False
3. If the current element is not equal to previous element, skip the element and continue

Time = O(n), n = number of elements
Space = constant = O(1)
"""
class RemoveDuplicates:
        def removeDuplicates(self, nums: List[int]) -> int:

            if not nums or len(nums) == 0:
                        return 0
                
            if len(nums) == 2:
                return len(nums)
            
            first = 0
            cur = 1
            count = 1
            flag = True

            while cur<len(nums):
                if nums[first] == nums[cur]:
                    if flag:
                        nums[count] = nums[cur]
                        cur += 1
                        count += 1
                        flag = False
                    else:
                        cur += 1
                else:
                    first = cur
                    nums[count] = nums[cur]
                    count += 1
                    cur += 1
                    flag = True
            return count