# Time Complexity : O(n)
# Space Complexity : O(1)
class Solution:
    def removeDuplicates(self, nums):
        if not nums or len(nums) == 0:
            return len(nums)
        
        n = len(nums)
        i, j = 2, 2  # First and second pointers
        
        while j < n:
            if nums[j] != nums[i - 2]:
                nums[i] = nums[j]
                i += 1
            j += 1
        
        return i

# Examples

# Example 1
nums1 = [1, 1, 1, 2, 2, 3]

# Example 2
nums2 = [0, 0, 1, 1, 1, 1, 2, 3, 3]

# Example 3
nums3 = [1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 6]

solution = Solution()

result1 = solution.removeDuplicates(nums1)
result2 = solution.removeDuplicates(nums2)
result3 = solution.removeDuplicates(nums3)

print(nums1[:result1])  # Output: [1, 1, 2, 2, 3]
print(nums2[:result2])  # Output: [0, 0, 1, 1, 2, 3, 3]
print(nums3[:result3])  # Output: [1, 1, 2, 2, 3, 4, 4, 5, 5, 6]