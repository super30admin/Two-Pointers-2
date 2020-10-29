#Time Complexity : O(n) where n is total length of both arrays
#Space Complexity : O(1)

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Keeping two pointers one for each array starting at the m and n index respectively, keep comparing each and whichever number is bigger append to nums1 array using a third pointer which starts at the end of the nums1 array and keeping moving pointers ahead as adding values. At the end whichever numbers are remaining in nums2 add to nums1.

#Your code here along with comments explaining your approach


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        one, two, i = m-1, n-1, m+n-1

        #iterate through both arrays
        while one >= 0 and two >= 0:
            if nums1[one] < nums2[two]:
                nums1[i] = nums2[two]
                two -= 1
            else:
                nums1[i] = nums1[one]
                one -= 1
            i -= 1

        #append left over elements in nums2 to nums1
        nums1[:two+1] = nums2[:two+1]
