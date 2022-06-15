class Solution:
    def merge(self, nums1, m, nums2, n) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        print(nums1, "Before Merging")
        ptr1 = m - 1  # pointer 1 at the last big element of nums1
        ptr2 = n - 1  # pointer 2 at the last element of nums2
        i = (m + n) - 1  # pointer 3 at the last element of nums2

        while ptr1 >= 0 and ptr2 >= 0:
            if nums1[ptr1] > nums2[ptr2]:  # if pointer at nums1 is greater than nums2 we put at the last of nums1
                nums1[i] = nums1[ptr1]
                ptr1 -= 1  # move the pointer backward if that element is selected
            else:
                nums1[i] = nums2[ptr2]
                ptr2 -= 1

            i -= 1

        while ptr2 >= 0:  # condition to check if the elements at nums2 are still remaining
            nums1[i] = nums2[ptr2]  # replace remainng elements of nums1
            ptr2 -= 1
            i -= 1

        print(nums1, "After Merging")


if __name__ == "__main__":
    obj = Solution()
    obj.merge([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3)

# TC = O(m) + O(n).
# Space complexity : O(1). Constant. No extra space used
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
