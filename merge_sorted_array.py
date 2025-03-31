# Approach:
# We merge two sorted arrays by starting from the end of both arrays using three pointers: p1 for nums1, p2 for nums2, and p for the placement in nums1.
# We compare the elements from the back and place the larger one at the end of nums1.
# After one of the arrays is exhausted, we copy any remaining elements from nums2 (if any) into nums1.

# Time Complexity: O(m + n), where m and n are the lengths of nums1 and nums2 respectively.
# Space Complexity: O(1), since the merge is performed in-place without using extra space.

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        p = m+n-1

        while p1>= 0 and p2>=0:
            if nums1[p1] > nums2[p2]:
                nums1[p] = nums1[p1]
                p1-=1
            else:
                nums1[p] = nums2[p2]
                p2-=1
            p-=1

        while p2>=0:
            nums1[p] = nums2[p2]
            p2-=1
            p-=1


        
        
