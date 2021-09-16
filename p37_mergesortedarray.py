class Solution:
    def merge(self, nums1, m: int, nums2, n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        We take three pointers one starting with array 1 starting with array1's filled end, 2nd starting with array 2 end, and third pointer starting at the combined m+n list end. If we find that value of the pointer to the last number in nums1 is greater than value of the pointer to the last number in nums2, we append the greater value at the end of the combined array and move the pointer to the left of whichever value came to be greater among them.
        TC: O(m+n)
        SC: O(1)no extra space
        Leetcode yes
        """
        ptr1 = m - 1
        ptr2 = n - 1
        i = m + n - 1
        while ptr1 >= 0 and ptr2 >= 0:
            if nums1[ptr1] > nums2[ptr2]:
                nums1[i] = nums1[ptr1]
                ptr1 -= 1
            else:
                nums1[i] = nums2[ptr2]
                ptr2 -= 1
            i -= 1
        while ptr2 >= 0:
            nums1[i] = nums2[ptr2]
            ptr2 -= 1
            i -= 1

