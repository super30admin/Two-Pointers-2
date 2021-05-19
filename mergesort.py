class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None: 
        """
        Do not return anything, modify nums1 in-place instead.
        start from the last elements 
        
        """
        '''
        TC : O(N)
        SC : O(1)
        Approach : 
        Use mearge sort from the end 
        check last elemnts of the both list choose the highest one and store it to the last position and repeat it until we traverse bothe list
        '''
        ans = []    
        i = m - 1
        j = n - 1
        k = m+n-1
        while i >= 0 or j >= 0:
            if j<0 or (i>=0 and nums1[i] >= nums2[j]):
                nums1[k] = nums1[i]
                i-=1
            else:
                nums1[k] = nums2[j]
                j-=1
            k-=1
        # while i >= 0:
        #     nums1[k] = nums1[i]
        #     i-=1
        #     k-=1
        # while j >= 0:
        #     nums1[k] = nums2[j]
        #     j-=1
        #     k-=1
        # return ans