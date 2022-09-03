"""
Time Complexity : O(n) where n is the number of array elements
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Three line explanation of solution in plain english:
Two pointers approach. Use slow and fast pointer such that slow pointer will be stopped when elements repeats for 2 and fast pointer is increments until the next different element is found. Once the fast pointer finds the unique element replace that value with the slow pointer and increment slow pointer. Repeat until fast pointer covers all the array elements. Return the slow pointer.

"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return []
        slow = 1
        fast = 1
        count = 1
        while(fast <= len(nums)-1):
            if nums[fast] == nums[fast-1]:
                count += 1
            else:
                count = 1
            
            if count <= 2:
                nums[slow] = nums[fast]
                slow += 1
            
            fast += 1
        return slow