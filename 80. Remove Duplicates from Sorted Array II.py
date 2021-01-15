# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach
	# use two pointers.let both be on the 1st index
	# iterate the fast pointer if the previos value is not the same the as the cuurent one reset the count to 1
	# else increment it by 1.check if the the count is equal to 2 if so copy the fast to slow positon
	# return the slow pointer that will give the equired list.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        s = 1
        f = 1
        count = 1
        
        for f in range(1,len(nums)):
            if nums[f] == nums[f-1]:
                count += 1
            else:
                count = 1
                
            if count <= 2:
                nums[s] = nums[f]
                s += 1
        return s