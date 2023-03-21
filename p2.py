#tc = o(n+m)
#sc = o(1)
#ran on leetcode:yes


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m - 1
        p2 = n - 1
        i = len(nums1) - 1

        while p1 >= 0 and p2 >= 0:
            if nums1[p1] >= nums2[p2]:
                nums1[i] = nums1[p1]
                p1 -= 1
                i -= 1
            elif nums2[p2] > nums1[p1]:
                nums1[i] = nums2[p2]
                p2 -= 1
                i -= 1
        
        #if while loop ends and nums2 still has items in it,
        #move it to nums1

        if p2 >= 0:
            for j in range(i,-1, -1):
                nums1[j] = nums2[p2]
                p2 -= 1
        return nums1

            #while p2 >= 0:
                #nums1[i] = nums2[p2]
                #p2 -= 1
                #i -= 1