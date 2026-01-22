class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #brute force solution
        #create a freq map, then overwrite the array but O(n) space

        slow = 0 #this is to re-write the array
        fast = 0 #this is to iterate over the array

        count = 0

        while fast < len(nums):

            curr = nums[fast]

            while (fast < len(nums) and nums[fast] == curr):
                fast += 1
                count += 1

            jumps = min(count, 2)

            while jumps > 0:
                nums[slow] = curr
                slow += 1
                jumps -= 1

            count = 0

        return slow

    # Time Complexity: O(2N) = O(N)
    # Space Complexity: O(1)