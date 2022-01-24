#Time Complexity = O(n+m)
#Space Complexity = O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m+n -1
        while(i>-1):
            val1 = float('-inf')
            val2 = float('-inf')
            if(n>0):
                val2 = nums2[n-1]
            if(m>0):
                val1 = nums1[m-1]
            if(val1>val2):
                nums1[i] =nums1[m-1]
                m-=1
            else:
                nums1[i] = nums2[n-1]
                n-=1
            i-=1
            

