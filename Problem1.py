## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums == [] or len(nums)==0:
            return []
        slow = 1
        fast = 1
        count = 1
        while fast<len(nums):
            if nums[fast]==nums[fast-1]:
                count = count+1
            else:
                count = 1
            if count<=2:
                nums[slow]=nums[fast]
                slow = slow+1
            fast = fast+1
        return slow
    
    #Time Complexity: O(n)
    #Space Complexity: O(1)
    #Approach: two pointers fast and slow, compare and change values accordingly
    
                
