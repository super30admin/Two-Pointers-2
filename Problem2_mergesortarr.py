'''
Our approach is to put 1 pointer on the last position of smaller array,  and two poinnters in the larger array.
'''
'''
Time Complexity : O(m+n)
Space Complexity: O(1)
'''


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m - 1
        p2 = n - 1
        idx = (m + n) - 1

        while (p1 >= 0 and p2 >= 0):
            # if the element of the first array is bigger then the second
            if (nums1[p1] > nums2[p2]):
                # replace the number at idx with the number that was bigger
                nums1[idx] = nums1[p1]
                p1 -= 1
            else:
                nums1[idx] = nums2[p2]
                p2 -= 1
            idx -= 1
        while (p2 >= 0):
            # keep putting p2 into our nums1 thus we have the result in nums 1
            nums1[idx] = nums2[p2]
            p2 -= 1
            idx -= 1