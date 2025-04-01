"""
Approach:
Since the array is sorted, duplicates will be next to each other.
The first two elements are always valid, so we start from index 2. We allow each number to appear at most twice.
If nums[fast] != nums[slow - 2], it means it's okay to place nums[fast] in the slow position.
in the end we return slow value for length.

T.c: O(n)
S.c: O(1)

Passed in leetcode : yes
Any Issues: No
"""

from typing import List
class Solution:
    def removeDuplicates(self, nums: List[int], k:int) -> int:
        """
        Approach: Since the array is sorted, duplicates are next to each other. 
        I use a fast pointer to scan the array and a slow pointer to write valid entries. 
        For each value, if it matches the previous one, I increment the count. 
        If the count is within the allowed limit of 2, I write it at the slow index.
        k = 2
        count = 0
        slow = 0
        fast = 0
        while(fast < len(nums)):          
            if (fast != 0 and nums[fast] == nums[fast -1]):
                count += 1      
            else:
                count = 1
            if (count <=k):
                nums[slow] = nums[fast]
                slow += 1
            fast += 1
        return slow"""

        if len(nums) <= k:
            return len(nums)
        
        slow = k  # position to write to
        for fast in range(k, len(nums)):
            # Only write if the current number is not equal to the element at slow - 2
            if nums[fast] != nums[slow - k]:
                nums[slow] = nums[fast]
                slow += 1
        return slow
sol = Solution()    
nums = [1,1,1,2,2,3,3,3,3,3,3,4,4,4,4,4,4]
k = 2
print(sol.removeDuplicates(nums, k))

        