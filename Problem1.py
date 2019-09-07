 # Time Complexity : O(n)
 # Space Complexity : O(1) Because it is in place
 # Did this code successfully run on Leetcode : Yes
 # Three line explanation of solution in plain english:
 # - Start with two pointers left and right and one flag. Start with flag as False (As we didn't encountered number twice.)
 # - Loop until right pointer covers all element and increase right pointer every time. 
 # - If left and right indexed number is same and we didn't encountered it before, increase the left index, copy right number to left and convert flag to True. If the left and right indexed number are different, increase the left index, copy right unmber to left and convert flag to True. 

 # Your code here along with comments explaining your approach

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
#       Initialize left index right index and flag.
        left, right = 0, 1
#       We need flag because we allow same number maximum 2 times. If we alllowed every number once we don't need this flag.
        flag = False
#       Run this loop until right has covered all the numbers
        while(right < len(nums)):
#           Check if left and right indexed number are same and flag is false.(Number encountered first time)
            if nums[left] == nums[right] and flag == False:
#               Increase the left index
                left += 1
#               Make left indexed number eqaul to right indexed number
                nums[left] = nums[right]
#               Make flag True as we don't want to come to this condition again for same number.
                flag = True
#           Check if the number is different
            elif nums[left] != nums[right]:
#               Increase the left index
                left += 1
#               Make left indexed number eqaul to right indexed number
                nums[left] = nums[right]
#               Make flag to False as we encountered new number only once.
                flag = False
#           Increasing the right index every time
            right += 1
        
        return left + 1
