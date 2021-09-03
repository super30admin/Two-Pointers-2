class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        """
        TC: O(n+m)
        SC: O(1)
        """
        
        # 1.Base case
        if nums1 == None or nums2 == None:
            return
        
        # 2. when either of the arrays are not empty
        
        index = (n + m) - 1
        i = m - 1
        j = n - 1
        
        # compare i and j elements and arrange them
        # according to their order in nums1 array
        while i >= 0 and j >= 0:
            
            if nums1[i] < nums2[j]:
                nums1[index] = nums2[j]
                j -= 1
            else:
                nums1[index] = nums1[i]
                i -= 1
            index -= 1
        
        # if there are elements left in nums2 array
        # then just insert them in the nums1 remaining array
        while j >= 0:
            nums1[index] = nums2[j]
            j -= 1
            index -= 1
        