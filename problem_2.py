# Time complexity - O(m+n)
# Space Complexity - O(1)




class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        l1 = m-1
        l2 = n-1
        r = m+n-1 

        while l1 >= 0 and l2 >= 0 : 

            if nums1[l1] >= nums2[l2]:
                nums1[r] = nums1[l1] 
                l1-= 1 
            else:
                nums1[r] = nums2[l2] 
                l2-= 1 
            r -= 1 

        while l2 >= 0 :
            nums1[r] = nums2[l2]
            l2 -= 1 
            r -= 1
        