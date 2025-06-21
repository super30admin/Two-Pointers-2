#hashmap solution takes O(n) space

#two pointers:
#Fast to scan and Slow to overwrite allowed elements. Count duplicates and only allow each element to appear at most twice. If count is within limit, place it in the right position using the slow pointer.
#Time Complexity:O(n)
#Space Complexity:O(1)
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 2
        slow = 0
        fast = 0
        count = 0
        while fast < len(nums):
            if fast != 0 and nums[fast] == nums[fast - 1]:
                count += 1
            else:
                count = 1
            if count <= k:
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow