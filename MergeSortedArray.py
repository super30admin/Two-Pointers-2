# Time complexity: O(n) (m==n) here
# Space complexity: O(1)

# edge case: there is a possibility that there are no elements in nums1 but only enough space to fill it with nums2 values.
# At the end of the iteration make sure to add another loop to traverse through nums2 remaining elements
class Solution:
    def merge(self, nums1, m, nums2, n):
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1, p2, p3 = m-1, n-1, m+n-1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p3] = nums1[p1]
                p1 -= 1
            else:
                nums1[p3] = nums2[p2]
                p2 -= 1
            p3 -= 1

        while p2 >= 0:
            nums1[p3] = nums2[p2]
            p2 -= 1
            p3 -= 1

        return nums1


solution = Solution()
print(solution.merge([1, 2, 3, 0, 0, 0], 3, [4, 5, 6], 3))
print(solution.merge([0, 0, 0], 0, [4, 5, 6], 3))
