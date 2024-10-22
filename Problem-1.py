'''
    Time Complexity: O(n)
    Space complexity: O(1)
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        slow, fast = 0, 0
        k = 2

        while fast < len(nums):
            if fast == 0 or nums[fast] != nums[fast-1]:
                count = 1
            else: 
                count += 1
            
            if count <= k:
                nums[slow] = nums[fast]
                slow += 1
                fast += 1
            else:
                fast += 1

        return slow

             