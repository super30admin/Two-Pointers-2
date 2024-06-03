# Time Complexity : O(m+n)
# Space Complexity : O(1)
class Solution:
    def merge(self, nums1, m, nums2, n):
        if not nums1 or len(nums1) == 0:
            return
        
        i, j, k = m - 1, n - 1, m + n - 1
        
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1
        
        while j >= 0:
            nums1[k] = nums2[j]
            k -= 1
            j -= 1

# Examples

# Example 1
nums1_1 = [1, 2, 3, 0, 0, 0]
m1 = 3
nums2_1 = [2, 5, 6]
n1 = 3

# Example 2
nums1_2 = [4, 5, 6, 0, 0, 0]
m2 = 3
nums2_2 = [1, 2, 3]
n2 = 3

# Example 3
nums1_3 = [0]
m3 = 0
nums2_3 = [1]
n3 = 1

solution = Solution()

solution.merge(nums1_1, m1, nums2_1, n1)
solution.merge(nums1_2, m2, nums2_2, n2)
solution.merge(nums1_3, m3, nums2_3, n3)

print(nums1_1)  # Output: [1, 2, 2, 3, 5, 6]
print(nums1_2)  # Output: [1, 2, 3, 4, 5, 6]
print(nums1_3)  # Output: [1]