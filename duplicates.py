# Time Complexity : O(N)
# Space Complexity : O{1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Create 2 pointers slow and fast= 2
#Check if slow -2 and fast are not equal and if so then assign nums[fast] to nums[slow] and increment slow and fast pointers
#If they are equal then just increment the fast pointer
def removeDuplicates(self, nums):
		if len(nums) < 2: return len(nums)
        slow, fast = 2, 2

        while fast < len(nums):
            if nums[slow - 2] != nums[fast]:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow