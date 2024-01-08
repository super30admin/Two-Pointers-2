#time complexity : O(m+n) where m and n are the lengths of nums1 and nums2, respectively.
#space complexity : O(1)
#submit on leetcode: yes


class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        i = m+n -1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] >= nums2[p2]:
                nums1[i] = nums1[p1]
                p1 -= 1
            else:
                nums1[i] = nums2[p2]
                p2 -= 1
            i -= 1

        while p2 >= 0:
            nums1[i] = nums2[p2]
            p2 -= 1
            i -= 1


solution = Solution()
nums1 = [1, 2, 3, 0, 0, 0]
m = 3
nums2 = [2, 5, 6]
n = 3
solution.merge(nums1, m, nums2, n)
print("Merged Array:", nums1)









