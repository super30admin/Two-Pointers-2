'''
Problem: Rmove duplicates from sorted array
Time Complexity: O(n), where n is given elements
Space Complexity: O(1)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        traverse array using slow and fast pointer
        fast pointer search for duplicates
        slow pointer is where numbers needs to be replaced
'''

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow = 0
        fast = slow+1
        count = 1

        while fast <len(nums):
            if nums[fast] == nums[fast-1]:
                count+=1
            else:
                count = 1

            if count<=2:
                slow +=1
                nums[slow] = nums[fast]
            fast+=1
        
        return slow +1
