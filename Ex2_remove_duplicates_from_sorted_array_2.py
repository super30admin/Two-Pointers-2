# Time Complexity : O(n), where n is the length of the input array
# Space Complexity : O(1), in-place modification
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        # Two Pointers Approach -  Overwriting unwanted duplicates (Time: O(n), Space: O(1))
        if len(nums) <= 2:
            return len(nums)

        i = 2

        for j in range(2, len(nums)):
            if nums[j] != nums[i - 2]:
                nums[i] = nums[j]
                i += 1

        return i
    
#------------------------------------------------------------------------- 
        #Naive Approach - Popping Unwanted Duplicates (Time: O(n²), Space: O(1))

        # i = 1
        # count = 1

        # while i < len(nums):
        #     if nums[i] == nums[i - 1]:
        #         count += 1
        #         if count > 2:
        #             nums.pop(i)
        #             i -= 1
        #             count -= 1
        #     else:
        #         count = 1

        #     i += 1

        # return len(nums)


if __name__ == "__main__":
    sol = Solution()
    
    nums1 = [1, 1, 1, 2, 2, 3]
    k1 = sol.removeDuplicates(nums1)
    print(nums1[:k1])  # Output: [1, 1, 2, 2, 3]

    nums2 = [0, 0, 1, 1, 1, 1, 2, 3, 3]
    k2 = sol.removeDuplicates(nums2)
    print(nums2[:k2])  # Output: [0, 0, 1, 1, 2, 3, 3]
