class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # if not sorted use hashmap and store the freq - TO(n)S O(n)
        # if sorted use two pointers like below - O(n) S O(1)
        count = 1
        slow = 1
        for i in range(1,len(nums)):
            if (i > 0 and nums[i] == nums[i-1]):
                count += 1
            else:
                count = 1
            if count <= 2:
                nums[slow] = nums[i]
                slow += 1
        return slow
