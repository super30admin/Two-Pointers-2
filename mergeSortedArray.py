class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Method 1: Time Compexity: O(N+M logN+M)
        Space Compexity: O(1)
        """
        # for i in range(len(nums2)):
        #     nums1[m+i] = nums2[i]
        # nums1.sort()

        """
        Method 2: TimeCompexity: O(M+N)
        Space Compexity: O(1)
        """
        # take 3 pointers
        p1 = len(nums1)-1
        p2 = m-1
        p3 = n-1
        # Iterate backwards through nums1, starting from the end
        for i in range(p1, -1, -1):
            # If all elements from nums2 have been merged, break the loop
            if p3 < 0:
                break
            # If elements from nums1 remain and the current element in nums1 is greater than
            # the current element in nums2, place the nums1 element at the current position i
            # and move the pointer p2 one step back
            if p2 >= 0 and nums1[p2] > nums2[p3]:
                nums1[i] = nums1[p2]
                p2 -= 1
            # Otherwise, place the nums2 element at the current position i
            # and move the pointer p3 one step back
            else:
                nums1[i] = nums2[p3]
                p3 -= 1
