"""
Problem: 88. Merge Sorted Array
Solution:
    - Use 3 pointers, p1 at the end of numbers of num1, p at the end of num1 and p2 at the end of num2
    - Compare numbers at p1 and p2 and put larger number in p
Time Complexity: O(m+n), m and n are lengths of given array
Space Complexity: O(1), in place implementation
"""


class Solution:
    def merge(self, nums1, m, nums2, n) -> None:
        # pointer at last number of nums1 that is not 0
        p1 = m - 1
        # pointer at last index of nums2
        p2 = n - 1
        # pointer at last index of nums1
        p = m + n - 1

        # traverse in reverse order
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] <= nums2[p2]:
                nums1[p] = nums2[p2]
                p2 -= 1
            else:
                nums1[p] = nums1[p1]
                p1 -= 1
            p -= 1

        while p2 >= 0:
            nums1[p] = nums2[p2]
            p2 -= 1
            p -= 1

        return nums1


obj = Solution()
print(obj.merge([1,2,3,0,0,0], 3, [2,5,6], 3))