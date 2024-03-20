#Time Complexity : O(m+n)
#Space Complexity : O(1)
#Any problem you faced while coding this : -

#The approach is to maintain two pointers - for each of the two arrays. We start filling up the main array(array1) by adding largest element from the two arrays at the end of the main array. Lastly, if there are any remaining elements in the second array, we add them directly.  

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1, p2, idx = m - 1, n - 1, m + n - 1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] >= nums2[p2]:
                nums1[idx] = nums1[p1]
                p1 -= 1
            else:
                nums1[idx] = nums2[p2]
                p2 -= 1

            idx -= 1

        while p2 >= 0:
            nums1[idx] = nums2[p2]
            idx -= 1
            p2 -= 1
